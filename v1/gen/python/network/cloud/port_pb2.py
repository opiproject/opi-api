# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/cloud/port.proto
# Protobuf Python Version: 5.29.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    3,
    '',
    'network/cloud/port.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18network/cloud/port.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd4\x01\n\x04Port\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12<\n\x04spec\x18\x02 \x01(\x0b\x32(.opi_api.network.cloud.v1alpha1.PortSpecR\x04spec\x12\x42\n\x06status\x18\x03 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.PortStatusR\x06status:6\xea\x41\x33\n#opi_api.network.cloud.v1alpha1/port\x12\x0cports/{port}\"\xad\x05\n\x08PortSpec\x12\x1f\n\x0bport_number\x18\x01 \x01(\x05R\nportNumber\x12O\n\x0b\x61\x64min_state\x18\x02 \x01(\x0e\x32..opi_api.network.cloud.v1alpha1.PortAdminStateR\nadminState\x12<\n\x04type\x18\x03 \x01(\x0e\x32(.opi_api.network.cloud.v1alpha1.PortTypeR\x04type\x12?\n\x05speed\x18\x04 \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.PortSpeedR\x05speed\x12\x46\n\x08\x66\x65\x63_type\x18\x05 \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.PortFecTypeR\x07\x66\x65\x63Type\x12%\n\x0e\x61utoneg_enable\x18\x06 \x01(\x08R\rautonegEnable\x12)\n\x10\x64\x65\x62ounce_timeout\x18\x07 \x01(\x05R\x0f\x64\x65\x62ounceTimeout\x12\x10\n\x03mtu\x18\x08 \x01(\x05R\x03mtu\x12L\n\npause_type\x18\t \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.PortPauseTypeR\tpauseType\x12\x1e\n\x0btx_pause_en\x18\n \x01(\x08R\ttxPauseEn\x12\x1e\n\x0brx_pause_en\x18\x0b \x01(\x08R\trxPauseEn\x12U\n\rloopback_mode\x18\x0c \x01(\x0e\x32\x30.opi_api.network.cloud.v1alpha1.PortLoopBackModeR\x0cloopbackMode\x12\x1f\n\x0blanes_count\x18\r \x01(\x05R\nlanesCount\"\x93\x03\n\nPortStatus\x12\x19\n\x08if_index\x18\x01 \x01(\rR\x07ifIndex\x12O\n\x0blink_status\x18\x02 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.PortLinkStatusR\nlinkStatus\x12O\n\x0bxcvr_status\x18\x03 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.PortXcvrStatusR\nxcvrStatus\x12H\n\tfsm_state\x18\x04 \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.PortLinkFSMR\x08\x66smState\x12\x15\n\x06mac_id\x18\x05 \x01(\x05R\x05macId\x12\x15\n\x06mac_ch\x18\x06 \x01(\x05R\x05macCh\x12P\n\nfsm_record\x18\x07 \x03(\x0b\x32\x31.opi_api.network.cloud.v1alpha1.PortLinkFSMRecordR\tfsmRecord\"\xb0\x02\n\x0ePortLinkStatus\x12L\n\noper_state\x18\x01 \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.PortOperStateR\toperState\x12H\n\nport_speed\x18\x02 \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.PortSpeedR\tportSpeed\x12\x1d\n\nautoneg_en\x18\x03 \x01(\x08R\tautonegEn\x12\x1f\n\x0blanes_count\x18\x04 \x01(\x05R\nlanesCount\x12\x46\n\x08\x66\x65\x63_type\x18\x05 \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.PortFecTypeR\x07\x66\x65\x63Type\"\xd1\x04\n\x0ePortXcvrStatus\x12\x12\n\x04port\x18\x01 \x01(\x05R\x04port\x12\x43\n\x05state\x18\x02 \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.PortXcvrStateR\x05state\x12=\n\x03pid\x18\x03 \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.PortXcvrPidR\x03pid\x12H\n\nmedia_type\x18\x04 \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.MediaTypeR\tmediaType\x12\x1d\n\nxcvr_sprom\x18\x05 \x01(\x0cR\txcvrSprom\x12\x1e\n\nvendorname\x18\x06 \x01(\tR\nvendorname\x12\x1d\n\nvendor_oui\x18\x07 \x01(\tR\tvendorOui\x12#\n\rencoding_type\x18\x08 \x01(\x05R\x0c\x65ncodingType\x12#\n\rserial_number\x18\t \x01(\tR\x0cserialNumber\x12\x1f\n\x0bpart_number\x18\n \x01(\tR\npartNumber\x12\x1a\n\x08revision\x18\x0b \x01(\tR\x08revision\x12 \n\x0btemperature\x18\x0c \x01(\x05R\x0btemperature\x12)\n\x10warn_temperature\x18\r \x01(\x05R\x0fwarnTemperature\x12+\n\x11\x61larm_temperature\x18\x0e \x01(\x05R\x10\x61larmTemperature\"\xb4\x01\n\x11PortLinkFSMRecord\x12H\n\tfsm_state\x18\x01 \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.PortLinkFSMR\x08\x66smState\x12\x39\n\nstate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\tstateTime\x12\x1a\n\x08\x64uration\x18\x03 \x01(\tR\x08\x64uration*f\n\x0ePortAdminState\x12 \n\x1cPORT_ADMIN_STATE_UNSPECIFIED\x10\x00\x12\x19\n\x15PORT_ADMIN_STATE_DOWN\x10\x01\x12\x17\n\x13PORT_ADMIN_STATE_UP\x10\x02*\xaf\x01\n\rPortXcvrState\x12\x1f\n\x1bPORT_XCVR_STATE_UNSPECIFIED\x10\x00\x12\x1c\n\x18PORT_XCVR_STATE_INSERTED\x10\x01\x12\x1b\n\x17PORT_XCVR_STATE_PENDING\x10\x02\x12\x1e\n\x1aPORT_XCVR_STATE_SPROM_READ\x10\x03\x12\"\n\x1ePORT_XCVR_STATE_SPROM_READ_ERR\x10\x04*\xf8\x08\n\x0bPortXcvrPid\x12\x1d\n\x19PORT_XCVR_PID_UNSPECIFIED\x10\x00\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_100G_CR4\x10\x01\x12\"\n\x1ePORT_XCVR_PID_QSFP_40GBASE_CR4\x10\x02\x12\"\n\x1ePORT_XCVR_PID_SFP_25GBASE_CR_S\x10\x03\x12\"\n\x1ePORT_XCVR_PID_SFP_25GBASE_CR_L\x10\x04\x12\"\n\x1ePORT_XCVR_PID_SFP_25GBASE_CR_N\x10\x05\x12!\n\x1dPORT_XCVR_PID_QSFP_50G_CR2_FC\x10\x06\x12\x1e\n\x1aPORT_XCVR_PID_QSFP_50G_CR2\x10\x07\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_200G_CR4\x10\x08\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_100G_AOC\x10\x32\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_100G_ACC\x10\x33\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_100G_SR4\x10\x34\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_100G_LR4\x10\x35\x12\x1f\n\x1bPORT_XCVR_PID_QSFP_100G_ER4\x10\x36\x12\"\n\x1ePORT_XCVR_PID_QSFP_40GBASE_ER4\x10\x37\x12\"\n\x1ePORT_XCVR_PID_QSFP_40GBASE_SR4\x10\x38\x12\"\n\x1ePORT_XCVR_PID_QSFP_40GBASE_LR4\x10\x39\x12\"\n\x1ePORT_XCVR_PID_QSFP_40GBASE_AOC\x10:\x12 \n\x1cPORT_XCVR_PID_SFP_25GBASE_SR\x10;\x12 \n\x1cPORT_XCVR_PID_SFP_25GBASE_LR\x10<\x12 \n\x1cPORT_XCVR_PID_SFP_25GBASE_ER\x10=\x12!\n\x1dPORT_XCVR_PID_SFP_25GBASE_AOC\x10>\x12 \n\x1cPORT_XCVR_PID_SFP_10GBASE_SR\x10?\x12 \n\x1cPORT_XCVR_PID_SFP_10GBASE_LR\x10@\x12!\n\x1dPORT_XCVR_PID_SFP_10GBASE_LRM\x10\x41\x12 \n\x1cPORT_XCVR_PID_SFP_10GBASE_ER\x10\x42\x12!\n\x1dPORT_XCVR_PID_SFP_10GBASE_AOC\x10\x43\x12 \n\x1cPORT_XCVR_PID_SFP_10GBASE_CU\x10\x44\x12!\n\x1dPORT_XCVR_PID_QSFP_100G_CWDM4\x10\x45\x12 \n\x1cPORT_XCVR_PID_QSFP_100G_PSM4\x10\x46\x12!\n\x1dPORT_XCVR_PID_SFP_25GBASE_ACC\x10G\x12\x1f\n\x1bPORT_XCVR_PID_SFP_10GBASE_T\x10H\x12 \n\x1cPORT_XCVR_PID_SFP_1000BASE_T\x10I*T\n\tMediaType\x12\x1a\n\x16MEDIA_TYPE_UNSPECIFIED\x10\x00\x12\x15\n\x11MEDIA_TYPE_COPPER\x10\x01\x12\x14\n\x10MEDIA_TYPE_FIBER\x10\x02*b\n\rPortOperState\x12\x1f\n\x1bPORT_OPER_STATE_UNSPECIFIED\x10\x00\x12\x16\n\x12PORT_OPER_STATE_UP\x10\x01\x12\x18\n\x14PORT_OPER_STATE_DOWN\x10\x02*c\n\rPortPauseType\x12\x1f\n\x1bPORT_PAUSE_TYPE_UNSPECIFIED\x10\x00\x12\x18\n\x14PORT_PAUSE_TYPE_LINK\x10\x01\x12\x17\n\x13PORT_PAUSE_TYPE_PFC\x10\x02*\xb6\x06\n\x0bPortLinkFSM\x12\x1d\n\x19PORT_LINK_FSM_UNSPECIFIED\x10\x00\x12\x19\n\x15PORT_LINK_FSM_ENABLED\x10\x01\x12\x18\n\x14PORT_LINK_FSM_AN_CFG\x10\x02\x12\x1d\n\x19PORT_LINK_FSM_AN_DISABLED\x10\x03\x12\x1a\n\x16PORT_LINK_FSM_AN_START\x10\x04\x12\"\n\x1ePORT_LINK_FSM_AN_SIGNAL_DETECT\x10\x05\x12\x1d\n\x19PORT_LINK_FSM_AN_WAIT_HCD\x10\x06\x12\x1d\n\x19PORT_LINK_FSM_AN_COMPLETE\x10\x07\x12\x1c\n\x18PORT_LINK_FSM_SERDES_CFG\x10\x08\x12!\n\x1dPORT_LINK_FSM_WAIT_SERDES_RDY\x10\t\x12\x19\n\x15PORT_LINK_FSM_MAC_CFG\x10\n\x12\x1f\n\x1bPORT_LINK_FSM_SIGNAL_DETECT\x10\x0b\x12\x1f\n\x1bPORT_LINK_FSM_AN_DFE_TUNING\x10\x0c\x12\x1c\n\x18PORT_LINK_FSM_DFE_TUNING\x10\r\x12\x1e\n\x1aPORT_LINK_FSM_DFE_DISABLED\x10\x0e\x12 \n\x1cPORT_LINK_FSM_DFE_START_ICAL\x10\x0f\x12\x1f\n\x1bPORT_LINK_FSM_DFE_WAIT_ICAL\x10\x10\x12 \n\x1cPORT_LINK_FSM_DFE_START_PCAL\x10\x11\x12\x1f\n\x1bPORT_LINK_FSM_DFE_WAIT_PCAL\x10\x12\x12%\n!PORT_LINK_FSM_DFE_PCAL_CONTINUOUS\x10\x13\x12)\n%PORT_LINK_FSM_CLEAR_MAC_REMOTE_FAULTS\x10\x14\x12\x1f\n\x1bPORT_LINK_FSM_WAIT_MAC_SYNC\x10\x15\x12\'\n#PORT_LINK_FSM_WAIT_MAC_FAULTS_CLEAR\x10\x16\x12\"\n\x1ePORT_LINK_FSM_WAIT_PHY_LINK_UP\x10\x17\x12\x14\n\x10PORT_LINK_FSM_UP\x10\x18*q\n\x10PortLoopBackMode\x12#\n\x1fPORT_LOOP_BACK_MODE_UNSPECIFIED\x10\x00\x12\x1b\n\x17PORT_LOOP_BACK_MODE_MAC\x10\x01\x12\x1b\n\x17PORT_LOOP_BACK_MODE_PHY\x10\x02*X\n\x0bPortFecType\x12\x1d\n\x19PORT_FEC_TYPE_UNSPECIFIED\x10\x00\x12\x14\n\x10PORT_FEC_TYPE_FC\x10\x01\x12\x14\n\x10PORT_FEC_TYPE_RS\x10\x02*P\n\x08PortType\x12\x19\n\x15PORT_TYPE_UNSPECIFIED\x10\x00\x12\x11\n\rPORT_TYPE_ETH\x10\x01\x12\x16\n\x12PORT_TYPE_ETH_MGMT\x10\x02*\xf2\x01\n\tPortSpeed\x12\x1a\n\x16PORT_SPEED_UNSPECIFIED\x10\x00\x12\x12\n\x0ePORT_SPEED_10M\x10\x01\x12\x13\n\x0fPORT_SPEED_100M\x10\x02\x12\x11\n\rPORT_SPEED_1G\x10\x03\x12\x12\n\x0ePORT_SPEED_10G\x10\x04\x12\x12\n\x0ePORT_SPEED_25G\x10\x05\x12\x12\n\x0ePORT_SPEED_40G\x10\x06\x12\x12\n\x0ePORT_SPEED_50G\x10\x07\x12\x13\n\x0fPORT_SPEED_100G\x10\x08\x12\x13\n\x0fPORT_SPEED_200G\x10\t\x12\x13\n\x0fPORT_SPEED_400G\x10\nBj\n\x1eopi_api.network.cloud.v1alpha1B\tPortProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.cloud.port_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\tPortProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_PORT']._loaded_options = None
  _globals['_PORT']._serialized_options = b'\352A3\n#opi_api.network.cloud.v1alpha1/port\022\014ports/{port}'
  _globals['_PORTADMINSTATE']._serialized_start=2515
  _globals['_PORTADMINSTATE']._serialized_end=2617
  _globals['_PORTXCVRSTATE']._serialized_start=2620
  _globals['_PORTXCVRSTATE']._serialized_end=2795
  _globals['_PORTXCVRPID']._serialized_start=2798
  _globals['_PORTXCVRPID']._serialized_end=3942
  _globals['_MEDIATYPE']._serialized_start=3944
  _globals['_MEDIATYPE']._serialized_end=4028
  _globals['_PORTOPERSTATE']._serialized_start=4030
  _globals['_PORTOPERSTATE']._serialized_end=4128
  _globals['_PORTPAUSETYPE']._serialized_start=4130
  _globals['_PORTPAUSETYPE']._serialized_end=4229
  _globals['_PORTLINKFSM']._serialized_start=4232
  _globals['_PORTLINKFSM']._serialized_end=5054
  _globals['_PORTLOOPBACKMODE']._serialized_start=5056
  _globals['_PORTLOOPBACKMODE']._serialized_end=5169
  _globals['_PORTFECTYPE']._serialized_start=5171
  _globals['_PORTFECTYPE']._serialized_end=5259
  _globals['_PORTTYPE']._serialized_start=5261
  _globals['_PORTTYPE']._serialized_end=5341
  _globals['_PORTSPEED']._serialized_start=5344
  _globals['_PORTSPEED']._serialized_end=5586
  _globals['_PORT']._serialized_start=121
  _globals['_PORT']._serialized_end=333
  _globals['_PORTSPEC']._serialized_start=336
  _globals['_PORTSPEC']._serialized_end=1021
  _globals['_PORTSTATUS']._serialized_start=1024
  _globals['_PORTSTATUS']._serialized_end=1427
  _globals['_PORTLINKSTATUS']._serialized_start=1430
  _globals['_PORTLINKSTATUS']._serialized_end=1734
  _globals['_PORTXCVRSTATUS']._serialized_start=1737
  _globals['_PORTXCVRSTATUS']._serialized_end=2330
  _globals['_PORTLINKFSMRECORD']._serialized_start=2333
  _globals['_PORTLINKFSMRECORD']._serialized_end=2513
# @@protoc_insertion_point(module_scope)
