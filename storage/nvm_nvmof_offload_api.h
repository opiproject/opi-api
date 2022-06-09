/*
 * Copyright (C) 2022 Marvell International Ltd.
 * SPDX-License-Identifier: Apache-2.0
 */

/**
* @file nvm_nvmof_offload_api.h

* @brief this header file provides the API to interact
* with an NVMe to NVMeOF storage offload capable subsytem to
* query capabilities, create/remove local NVM subystems
* associate/disassociate local controllers exposed to Host
* with remote namespaces. 
*
* @author Satananda Burla
*/

#ifndef __NVM_NVMOF_OFFLOAD_API_H__
#define __NVM_NVMOF_OFFLOAD_API_H__

#define NVM_SUBNQN_SIZE 256
#define NVM_MN_SIZE 40
#define NVM_SN_SIZE 20
#define NVM_NGUID_SIZE 16
#define NVM_EUI64_SIZE 8
#define NVM_UUID_SIZE 16

struct nvm_offload_cap {
	uint32_t nvm_version; /**< nvm version of ctrlrs exposed by DPU */
	uint32_t num_pcie_domains; /**< number of pcie domains */
	uint32_t num_pfs_per_domain;/**< number of pfs per domain */
	uint32_t num_vfs_per_pf; /**< number of vfs per pf */
	uint32_t total_ioq_per_pf; /**< total number of ioq pairs in a pf */
	uint32_t max_ioq_per_pf; /**< max number of ioq pairs allowed per pf */
	uint32_t max_ioq_per_vf; /**< max number of ioq pairs alower per  pf */
	uint32_t max_subsystems; /**< max number of NVM subystems per DPU */
	uint32_t max_ns_per_subsys; /**< max namespaces per NVM subystem */
	uint32_t max_ctrlr_per_subsys; /**< max ctlrs per NVM subystem */
};

struct nvm_subsys_params {
	uint8_t subnqn[NVM_SUBNQN_SIZE]; /**< subsystem nqn */
	uint8_t mn[NVM_MN_SIZE]; /**< model number */
	uint8_t sn[NVM_SN_SIZE]; /**< serial number */
	uint32_t max_namespaces; /**< maximum namespaces */
	uint16_t min_ctrlr_id;  /**< mininmum controller id */
	uint16_t max_ctrlr_id; /** maximum controller id */
};

struct nvm_subsys_id {
	uint8_t subnqn[NVM_SUBNQN_SIZE]; /**< subsystem nqn */
};

struct nvm_subsys_info {
	struct nvm_subsys_params params; /**< subsystem parameters */
	uint32_t num_ns; /**< number of namespaces */
	uint32_t num_total_ctrlr; /**< total number of controllers */
	uint32_t num_active_ctrlr; /**< number of active controllers */
};

struct nvm_ns_params {
	uint8_t nguid[NVM_NGUID_SIZE]; /**< nguid */
	uint8_t eui64[NVM_EUI64_SIZE]; /**< eui64 */
	uint8_t uuid[NVM_UUID_SIZE]; /**< uuid */
	uint32_t nmic; /**< nmic */
};

enum nvm_ns_uid_type {
	NVM_NS_UID_TYPE_NGUID, /**< uid type nguid */
	NVM_NS_UID_TYPE_UUID, /**< uid type uuid */
	NVM_NS_UID_TYPE_EUI64 /**< uid type eui64 */
};

struct nvm_ns_uid {
	enum nvm_ns_uid_type uid_type; /**< uid type */
	union {
		uint8_t nguid[NVM_NGUID_SIZE]; /**< nguid */
		uint8_t eui64[NVM_EUI64_SIZE]; /**< eui64 */
		uint8_t uuid[NVM_UUID_SIZE]; /**< uuid */
	} u;
};

struct nvm_ns_stats {
	uint64_t num_read_cmds; /**< num of read commands */
	uint64_t num_read_bytes; /**< num of read bytes */
	uint64_t num_write_cmds; /**< num of write commands  */
	uint64_t num_write_bytes; /**< num of write bytes */
	uint64_t num_errors; /**< number of errors */
	uint64_t avg_read_latency; /**< average read latency */
	uint64_t avg_write_latency; /**< average write latency */
};

struct nvm_ns_info {
	struct nvm_ns_params params; /**< namespace parameters */
	struct nvm_subsys_id subsys_id; /**< subsystem id of namespace */
	uint32_t num_ctrlrs; /**< number of ctrlrs which have this namespace */
};

struct nvm_ctrlr_stats {
	uint64_t num_admin_cmds; /**< num of admin commands recieved on ctrlr */
	uint64_t num_admin_cmd_errors; /**< num of admin cmd errors */
	uint64_t num_async_events; /**< num of async events sent to host */
	uint64_t num_read_cmds; /**< num of read commands */
	uint64_t num_read_bytes; /**< num of read bytes */
	uint64_t num_write_cmds; /**< num of write commands */
	uint64_t num_write_bytes; /**< num of write bytes */
	uint64_t num_errors; /**< number of errors */
};

struct nvm_ctrlr_params {
	uint16_t pcie_domain_id, /**< pcie domain id */
	uint16_t pf_id, /**< pcie pf id */
	uint16_t vf_id, /**< pcie vf id 0 indicates PF */
	uint32_t ctrlr_id; /**< ctrlr id  */
	uint32_t max_nsq; /**< max submission queues that can be allocated */
	uint32_t max_ncq; /**< max completion queues that can be allocated */
	uint32_t mqes; /**< max num queue entries */
	uint32_t ieee_oui; /**< IEEE OUI */
	uint32_t cmic; /**< multipath capabilities */
	uint32_t nn; /**< number of namespaces */
};

struct nvm_ctrlr_info {
	struct nvm_ctrlr_params params;
	uint32_t active_ns_count; /**< number of active namespaces */
	uint32_t active_nsq; /**< number of submission queues */
	uint32_t active_ncq; /**< number of completion queues */
	uint32_t mdts; /**< maximum data transfer size */
	uint32_t sqes; /**< maximum sq entries */
	uint32_t cqes; /**< maximum cq entries */
};

typedef void * dpu_handle_t;


/* DPU NODE API */

/**
 * @brief init DPU nvm functionality library
 *
 * initializes NVM functionality of DPU
 * @param handle pointer to opaque DPU Identifier object
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_nvm_init(dpu_handle_t *handle);

/**
 * @brief get DPU nvm storage offload capabilities.
 *
 * provides capabilities of the DPU for NVMeOF offload
 * @parm handle handle to DPU node.
 * @param offload_cap pointer to set of capabilities.
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_get_offload_cap(const dpu_handle_t handle,
		    struct nvm_offload_cap  *offload_cap);

/**
 * @brief get NVM subystem count in DPU 
 *
 * get the count of number of subystems created
 * @parm handle handle to DPU node.
 * @param subsys_count output pointer to count
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_get_subsys_count(const dpu_handle_t handle,
		     uint32_t *subsys_count);

/**
 * @brief get list of NVM subsystems in DPU
 *
 * provides a list of created subsystems
 * @parm handle handle to DPU node.
 * @param subsys_list output pointer to list of subystems 
 * @param num_input_entries number of input entries
 * @param num_output_entries actual number of output entries 
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_get_subsys_list(const dpu_handle_t handle,
		    struct nvm_subsys_id *subsys_list,
		    uint16_t num_input_entries,
		    uint16_t *num_output_entries);



/**
 * @brief create an NVM subsystem on the DPU
 *
 * create an nvm subystem with given params. 
 * User should not create subystem with duplicate SUBNQN
 * even on different DPUs
 * @parm handle handle to DPU node.
 * @param subsys_params pointer to subsystem parameters
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_create_subsystem(const dpu_handle_t handle,
		     const struct nvm_subsys_params *subsys_params);

/**
 * @brief remove NVM subsystem from the DPU 
 *
 * remove an nvm subystem.
 * @parm handle handle to DPU node.
 * @param subsys_id pointer to subsystem id
 * All controllers and namespaces in the subsystem 
 * need to removed before removing a subsystem
 * @param subsys_id pointer to subsystem_id
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_remove_subsystem(dpu_handle_t handle,
		     const struct nvm_subsys_id *subsys);

/**
 * @brief close DPU nvm functionality library
 *
 * close NVM functionality of DPU
 * @param handle pointer to opaque DPU Identifier object
 * @return 0 on sucess appropriate error code on error 
 */
int
dpu_nvm_close(const dpu_handle_t *handle);

/* SUBSYSTEM API */

/**
 * @brief get subsystem info
 *
 * get subsystem information
 * @param subsys_id pointer to subsystem id
 * @param info pointer to subsystem info
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_subsys_get_info(const struct nvm_subsys_id *subsys_id,
			 struct nvm_subsys_info *info);

/**
 * @brief allocate namespace in a NVM subsystem 
 *
 * allocates namespace in a subsystem with given params.
 * The bdev name is a char* that can represent an SPDK bdev name.
 * Most parameters are copied from the bdev. only overidable parameters
 * are taken from ns_params.
 * @param subsys_id pointer to subsystem id
 * @param ns_params pointer to namespace parameters
 * @param bdev_name of remote namespace that is to be associated with this ns
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_subsys_alloc_ns(const struct nvm_subsys_id *subsys_id,
		    const struct nvm_ns_params *ns_params,
		    const uint8_t *bdev_name);

/**
 * @brief unallocate namespace in a NVM subsystem 
 *
 * unallocates namespace in a subsystem
 * @param subsys_id pointer to subsystem id
 * @param ns_uid pointer to ns uid
 * Namespace can be unallocated only if it is not attached to any controller
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_subsys_unalloc_ns(const struct nvm_subsys_id *subsys_id,
		      const struct nvm_ns_uid *ns_uid);


/**
 * @brief get list of Namespaces in subystem
 *
 * provides a list of namespasces in subsystem
 * @param ns_list output pointer to list of namespaces
 * @param num_input_entries number of entries in input pointer
 * @param num_output_entries number of entries being returned 
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_subsys_get_ns_list(const struct nvm_subsys_id *subsys_id,
		       struct nvm_ns_uid *ns_list, uint16_t num_input_entries,
		       uint16_t *num_output_entries);


/**
 * @brief create controller in a NVM subsystem 
 *
 * creates controller in a subsystem.
 * pf_id >= 0  and vf_id = 0 indicates PF controller with pf = pf_id 
 * pf_id >= 0  and vf_id >=1 indicates PF controller with pf = pf_id and vf =
 * vf_id.
 * pf_id = -1U and vf_id = 0 indicates next available PF controller to be used.
 * pf_id = -1U and vf_id = -1U indicates any next available conttroller 
 * to be used (PF and/or VF), 
 * The allocated pf_id and or vf_id will then be populated as output parameters
 * ctrlr_id >=0  indicates ctrlr_id to be used as passed.
 * ctrlr_id = -1U indicates controller id to be allocated and filled up
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_params pointer to controller params
 * @return 0 on sucess appropriate error code on error 
 */

int
nvm_subsys_create_ctrlr(const struct nvm_subsys_id *subsys_id,
			struct nvm_ctrlr_params *ctrlr_params);

/**
 * @brief remove controller in a NVM subsystem 
 *
 * removes controller from a subsystem
 * all namespaces need to be detached from the controller and
 * ctrlr should be in shutdown state before removing controller
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_id controller id to be removed 
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_subsys_remove_ctrlr(const struct nvm_subsys_id *subsys_id,
			     uint32_t ctrlr_id);

/**
 * @brief  get the list of controllers in subystem
 *
 * get the list of controllers in subystem
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_id_list pointer to list of controller ids
 * @param num_input_entries number of entries in input pointer
 * @param num_output_entries number of entries being returned 
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_subsys_get_ctrlr_list(const struct nvm_subsys_id *subsys_id,
			  int32_t *ctrlr_id_list, uint32_t num_input_entries,
			  uint16_t *num_output_entries);

/* NS API */

/**
 * @brief get namespace statistics 
 *
 * get the total statistics of namespace 
 * @param ns_uid pointer to ns uid
 * @param stats pointer to namespace statistics
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ns_get_stats(const struct nvm_ns_uid *uid, struct nvm_ns_stats *stats);


/**
 * @brief  get the list of controllers attached to a namespace
 *
 * get the list of controllers attached to a namespace
 * @param ns_uid pointer to ns uid
 * @param ctrlr_id_list pointer to list of controller ids
 * @param num_input_entries number of entries in input pointer
 * @param num_output_entries number of entries being returned 
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ns_get_ctrlr_list(const struct nvm_ns_uid *ns_uid, uint32_t *ctrlr_id_list,
		      uint32_t num_input_entries, uint16_t *num_output_entries);

/**
 * @brief get Namespace info
 *
 * get Namespace information
 * @param ns_uid pointer to ns uid
 * @param info pointer to ns info
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ns_get_info(const struct nvm_ns_uid *ns_uid, struct nvm_ns_info *info);

/* CTRLR API */

/**
 * @brief attach namespace to a controller in  NVM subsystem 
 *
 * attach namespace to a controller
 * if this is not the first attachment in the subystem
 * nsid should match the nsid used for previous attachment
 * nsid = -1U autoallocates nsid, valid only for first attachment
 * this generates an async event to the host with namespace attribute changed
 * notification causing hotplug of namespace.
 * @param subsys_id pointer to subsystem id
 * @param ns_uid pointer to ns uid
 * @param nsid nsid to be used for this namespace in this controller 
 * @return 0 on sucess appropriate error code on error 
 */

nvm_ctrlr_attach_ns(const struct nvm_subsys_id *subsys_id, uint32_t ctrlr_id,
		    const struct nvm_ns_uid *ns_uid, uint32_t nsid);

/**
 * @brief detach namespace from a controller in  NVM subsystem 
 *
 * detach namespace from a controller
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_id controller id
 * @param nsid nsid of the  namespace 
 * this generates an async event to the host with namespace attribute changed
 * notification causing hotunplug of namespace.
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ctrlr_detach_ns(const struct nvm_subsys_id *subsys_id, uint32_t ctrlr_id,
		    uint32_t nsid);

/**
 * @brief  get controller info
 *
 * get the controller info
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_id controller id
 * @param info pointer to controller info
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ctrlr_get_info(const struct nvm_subsys_id *subsys_id, uint32_t ctrlr_id,
		   struct nvm_ctrlr_info *info);
/**
 * @brief  get controller statistics 
 *
 * get the statistics of a controller
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_id controller id
 * @param stats pointer to controller stats 
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ctrlr_get_stats(const struct nvm_subsys_id *subsys_id, uint32_t ctrlr_id,
		    struct nvm_ctrlr_stats *stats);

/**
 * @brief  get ctrlr namespace statistics 
 *
 * get the statistics of namespace for this controller
 * Note, these are per this controller only, do not account for the
 * namespace usage in other controllers.
 * @param subsys_id pointer to subsystem id
 * @param ctrlr_id controller id
 * @param stats pointer to namespace statistics
 * @return 0 on sucess appropriate error code on error 
 */
int
nvm_ctrlr_get_ns_stats(const struct nvm_subsys_id *subsys_id,uint32_t ctrlr_id,
		       const struct nvm_ns_uid *uid,
		       struct nvm_ns_stats *stats);

#endif /* __NVM_NVMOF_OFFLOAD_API_H__ */
