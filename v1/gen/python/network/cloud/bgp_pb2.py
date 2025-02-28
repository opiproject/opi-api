# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: network/cloud/bgp.proto
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
    'network/cloud/bgp.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from network.opinetcommon import networktypes_pb2 as network_dot_opinetcommon_dot_networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17network/cloud/bgp.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\'network/opinetcommon/networktypes.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/api/field_behavior.proto\"\x83\x02\n\tBgpRouter\x12\x17\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x08R\x04name\x12;\n\x04spec\x18\x02 \x01(\x0b\x32\'.opi_api.network.cloud.v1alpha1.BgpSpecR\x04spec\x12\x41\n\x06status\x18\x03 \x01(\x0b\x32).opi_api.network.cloud.v1alpha1.BgpStatusR\x06status:]\xea\x41Z\n(opi_api.network.cloud.v1alpha1/BgpRouter\x12\x17\x62gpRouters/{bgp_router}*\nbgpRouters2\tbgpRouter\"\xbc\x01\n\x07\x42gpSpec\x12\x1b\n\tlocal_asn\x18\x01 \x01(\rR\x08localAsn\x12\x1b\n\trouter_id\x18\x02 \x01(\x07R\x08routerId\x12\x1d\n\ncluster_id\x18\x03 \x01(\x07R\tclusterId\x12\x18\n\x07\x64isable\x18\x04 \x01(\x08R\x07\x64isable\x12>\n\x1bsuppress_default_resolution\x18\x05 \x01(\x08R\x19suppressDefaultResolution\"\x94\x02\n\tBgpStatus\x12P\n\noper_state\x18\x01 \x01(\x0e\x32,.opi_api.network.cloud.v1alpha1.BGPOperStateB\x03\xe0\x41\x03R\toperState\x12\x36\n\x18\x61\x64j_rib_out_routes_count\x18\x02 \x01(\x05R\x14\x61\x64jRibOutRoutesCount\x12;\n\x1bpeak_num_adj_rib_out_routes\x18\x03 \x01(\x05R\x16peakNumAdjRibOutRoutes\x12#\n\rrem_delaytime\x18\x04 \x01(\x05R\x0cremDelaytime\x12\x1b\n\ttable_ver\x18\x05 \x01(\x05R\x08tableVer\"\xfa\x01\n\x07\x42gpPeer\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12?\n\x04spec\x18\x02 \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.BgpPeerSpecR\x04spec\x12\x45\n\x06status\x18\x03 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.BgpPeerStatusR\x06status:S\xea\x41P\n&opi_api.network.cloud.v1alpha1/BgpPeer\x12\x13\x62gpPeers/{bgp_peer}*\x08\x62gpPeers2\x07\x62gpPeer\"\xad\x05\n\x0b\x42gpPeerSpec\x12L\n\x05state\x18\x01 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateB\x03\xe0\x41\x03R\x05state\x12U\n\rlocal_address\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0clocalAddress\x12M\n\tpeer_addr\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x08peerAddr\x12\x1d\n\nremote_asn\x18\x04 \x01(\rR\tremoteAsn\x12\x1b\n\tsend_comm\x18\x05 \x01(\x08R\x08sendComm\x12\"\n\rsend_ext_comm\x18\x06 \x01(\x08R\x0bsendExtComm\x12\x46\n\trr_client\x18\x07 \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.BgpPeerRRR\x08rrClient\x12#\n\rconnect_retry\x18\x08 \x01(\x05R\x0c\x63onnectRetry\x12\x1a\n\x08holdtime\x18\t \x01(\x05R\x08holdtime\x12\x1d\n\nkeep_alive\x18\n \x01(\x05R\tkeepAlive\x12\x1a\n\x08password\x18\x0b \x01(\x0cR\x08password\x12\x10\n\x03ttl\x18\x0c \x01(\x05R\x03ttl\x12#\n\ridle_holdtime\x18\r \x01(\x05R\x0cidleHoldtime\x12$\n\x0e\x61llow_local_as\x18\x0e \x01(\x05R\x0c\x61llowLocalAs\x12)\n\x10peer_description\x18\x0f \x01(\tR\x0fpeerDescription\"\x8c\x12\n\rBgpPeerStatus\x12]\n\rsession_state\x18\x01 \x01(\x0e\x32\x33.opi_api.network.cloud.v1alpha1.BgpPeerSessionStateB\x03\xe0\x41\x03R\x0csessionState\x12\x66\n\x12prev_session_state\x18\x02 \x01(\x0e\x32\x33.opi_api.network.cloud.v1alpha1.BgpPeerSessionStateB\x03\xe0\x41\x03R\x10prevSessionState\x12&\n\x0flast_error_rcvd\x18\x03 \x01(\x0cR\rlastErrorRcvd\x12&\n\x0flast_error_sent\x18\x04 \x01(\x0cR\rlastErrorSent\x12O\n\nlocal_addr\x18\x05 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\tlocalAddr\x12\x1a\n\x08holdtime\x18\x06 \x01(\x05R\x08holdtime\x12\x1c\n\tkeepalive\x18\x07 \x01(\x05R\tkeepalive\x12\x1b\n\tcaps_sent\x18\x08 \x01(\x05R\x08\x63\x61psSent\x12\x1b\n\tcaps_rcvd\x18\t \x01(\x05R\x08\x63\x61psRcvd\x12\x19\n\x08\x63\x61ps_neg\x18\n \x01(\x05R\x07\x63\x61psNeg\x12Z\n\x13sel_local_addr_type\x18\x0b \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.BGPAddrTypeR\x10selLocalAddrType\x12\x35\n\x16incoming_notifications\x18\x0c \x01(\x05R\x15incomingNotifications\x12\x35\n\x16outbound_notifications\x18\r \x01(\x05R\x15outboundNotifications\x12)\n\x10incoming_updates\x18\x0e \x01(\x05R\x0fincomingUpdates\x12)\n\x10outgoing_updates\x18\x0f \x01(\x05R\x0foutgoingUpdates\x12/\n\x13incoming_keepalives\x18\x10 \x01(\x05R\x12incomingKeepalives\x12/\n\x13outgoing_keepalives\x18\x11 \x01(\x05R\x12outgoingKeepalives\x12-\n\x12incoming_refreshes\x18\x12 \x01(\x05R\x11incomingRefreshes\x12-\n\x12outgoing_refreshes\x18\x13 \x01(\x05R\x11outgoingRefreshes\x12\x36\n\x17incoming_total_messages\x18\x14 \x01(\x05R\x15incomingTotalMessages\x12\x36\n\x17outgoing_total_messages\x18\x15 \x01(\x05R\x15outgoingTotalMessages\x12.\n\x13\x66sm_est_transitions\x18\x16 \x01(\x05R\x11\x66smEstTransitions\x12.\n\x13\x63onnect_retry_count\x18\x17 \x01(\x05R\x11\x63onnectRetryCount\x12\x16\n\x06peergr\x18\x18 \x01(\x05R\x06peergr\x12%\n\x0estale_pathtime\x18\x19 \x01(\x05R\rstalePathtime\x12&\n\x0forf_entry_count\x18\x1a \x01(\x05R\rorfEntryCount\x12*\n\x11rcvd_msg_elpstime\x18\x1b \x01(\x05R\x0frcvdMsgElpstime\x12&\n\x0froute_refr_sent\x18\x1c \x01(\x05R\rrouteRefrSent\x12&\n\x0froute_refr_rcvd\x18\x1d \x01(\x05R\rrouteRefrRcvd\x12\'\n\x0fincoming_prfxes\x18\x1e \x01(\x05R\x0eincomingPrfxes\x12\'\n\x0foutgoing_prfxes\x18\x1f \x01(\x05R\x0eoutgoingPrfxes\x12<\n\x1aoutgoing_prfxes_advertised\x18  \x01(\x05R\x18outgoingPrfxesAdvertised\x12*\n\x11\x63onnect_retry_int\x18! \x01(\x05R\x0f\x63onnectRetryInt\x12\x38\n\x18outgoing_update_elpstime\x18\" \x01(\x05R\x16outgoingUpdateElpstime\x12\x34\n\x16outgoing_prfxes_denied\x18# \x01(\x05R\x14outgoingPrfxesDenied\x12\x35\n\x17outgoing_prfxes_imp_wdr\x18$ \x01(\x05R\x14outgoingPrfxesImpWdr\x12\x35\n\x17outgoing_prfxes_exp_wdr\x18% \x01(\x05R\x14outgoingPrfxesExpWdr\x12\x35\n\x17incoming_prfxes_imp_wdr\x18& \x01(\x05R\x14incomingPrfxesImpWdr\x12\x35\n\x17incoming_prfxes_exp_wdr\x18\' \x01(\x05R\x14incomingPrfxesExpWdr\x12+\n\x11received_holdtime\x18( \x01(\x05R\x10receivedHoldtime\x12/\n\x13\x66sm_establishedtime\x18) \x01(\x05R\x12\x66smEstablishedtime\x12:\n\x19incoming_updates_elpstime\x18* \x01(\x05R\x17incomingUpdatesElpstime\x12%\n\x0eincoming_opens\x18+ \x01(\x05R\rincomingOpens\x12%\n\x0eoutgoing_opens\x18, \x01(\x05R\routgoingOpens\x12\x1d\n\npeer_index\x18- \x01(\x05R\tpeerIndex\x12\x10\n\x03ttl\x18. \x01(\x05R\x03ttl\x12P\n\noper_state\x18/ \x01(\x0e\x32,.opi_api.network.cloud.v1alpha1.BGPOperStateB\x03\xe0\x41\x03R\toperState\"\x84\x02\n\tBgpPeerAf\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x41\n\x04spec\x18\x02 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.BgpPeerAfSpecR\x04spec\x12\x45\n\x05state\x18\x03 \x01(\x0b\x32/.opi_api.network.cloud.v1alpha1.BgpPeerAfStatusR\x05state:Y\xea\x41V\n(opi_api.network.cloud.v1alpha1/BgpPeerAf\x12\x13\x62gpPeerAfs/{peeraf}*\nbgpPeerAfs2\tbgpPeerAf\"\xc1\x05\n\rBgpPeerAfSpec\x12O\n\nlocal_addr\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\tlocalAddr\x12M\n\tpeer_addr\x18\x02 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x08peerAddr\x12\x38\n\x03\x61\x66i\x18\x03 \x01(\x0e\x32&.opi_api.network.cloud.v1alpha1.BGPAfiR\x03\x61\x66i\x12;\n\x04safi\x18\x04 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.BGPSafiR\x04safi\x12!\n\x0cnexthop_self\x18\x05 \x01(\x08R\x0bnexthopSelf\x12!\n\x0c\x64\x65\x66\x61ult_orig\x18\x06 \x01(\x08R\x0b\x64\x65\x66\x61ultOrig\x12\x1d\n\nlocal_port\x18\x07 \x01(\x05R\tlocalPort\x12\x1f\n\x0bremote_port\x18\x08 \x01(\x05R\nremotePort\x12-\n\x13local_addr_scope_id\x18\t \x01(\x05R\x10localAddrScopeId\x12O\n\x0cmax_prefixes\x18\n \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.BGPMaxPrefixR\x0bmaxPrefixes\x12H\n\troute_map\x18\x0b \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.BGPRouteMapR\x08routeMap\x12I\n\x07network\x18\x0c \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixR\x07network\"\xbd\x01\n\x0c\x42GPMaxPrefix\x12!\n\x0cmax_prefixes\x18\x01 \x01(\x05R\x0bmaxPrefixes\x12\'\n\x0fwarning_message\x18\x02 \x01(\tR\x0ewarningMessage\x12\x61\n\x12max_prefix_restart\x18\x03 \x01(\x0b\x32\x33.opi_api.network.cloud.v1alpha1.BGPMaxPrefixRestartR\x10maxPrefixRestart\"g\n\x13\x42GPMaxPrefixRestart\x12\'\n\x0frestart_message\x18\x01 \x01(\tR\x0erestartMessage\x12\'\n\x0frestart_minutes\x18\x02 \x01(\x05R\x0erestartMinutes\"B\n\x0b\x42GPRouteMap\x12\x15\n\x06map_id\x18\x01 \x01(\tR\x05mapId\x12\x1c\n\tdirection\x18\x02 \x01(\x08R\tdirection\"\xb9\x02\n\x0f\x42gpPeerAfStatus\x12!\n\x0cupdate_group\x18\x01 \x01(\x05R\x0bupdateGroup\x12-\n\x13local_addr_scope_id\x18\x02 \x01(\x05R\x10localAddrScopeId\x12#\n\rroute_refresh\x18\x03 \x01(\x08R\x0crouteRefresh\x12Y\n\x10\x61\x64\x64_path_cap_neg\x18\x04 \x01(\x0e\x32\x30.opi_api.network.cloud.v1alpha1.BgpAddPathCapNegR\raddPathCapNeg\x12T\n\x10reflector_client\x18\x05 \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.BgpPeerRRR\x0freflectorClient\"\xa1\x01\n\rBGPNLRIPrefix\x12\x45\n\x04spec\x18\x01 \x01(\x0b\x32\x31.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixSpecR\x04spec\x12I\n\x05state\x18\x02 \x01(\x0b\x32\x33.opi_api.network.cloud.v1alpha1.BGPNLRIPrefixStatusR\x05state\"\xd4\x02\n\x11\x42GPNLRIPrefixSpec\x12\x38\n\x03\x61\x66i\x18\x01 \x01(\x0e\x32&.opi_api.network.cloud.v1alpha1.BGPAfiR\x03\x61\x66i\x12;\n\x04safi\x18\x02 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.BGPSafiR\x04safi\x12\x16\n\x06prefix\x18\x03 \x01(\x0cR\x06prefix\x12\x1d\n\nprefix_len\x18\x04 \x01(\x05R\tprefixLen\x12J\n\x0croute_source\x18\x05 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.NLRISrcR\x0brouteSource\x12,\n\x12route_source_index\x18\x06 \x01(\x05R\x10routeSourceIndex\x12\x17\n\x07path_id\x18\x07 \x01(\x05R\x06pathId\"\xde\t\n\x13\x42GPNLRIPrefixStatus\x12\x38\n\x03\x61\x66i\x18\x01 \x01(\x0e\x32&.opi_api.network.cloud.v1alpha1.BGPAfiR\x03\x61\x66i\x12;\n\x04safi\x18\x02 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.BGPSafiR\x04safi\x12\x16\n\x06prefix\x18\x03 \x01(\x0cR\x06prefix\x12\x1d\n\nprefix_len\x18\x04 \x01(\x05R\tprefixLen\x12J\n\x0croute_source\x18\x05 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.NLRISrcR\x0brouteSource\x12,\n\x12route_source_index\x18\x06 \x01(\x05R\x10routeSourceIndex\x12\x17\n\x07path_id\x18\x07 \x01(\x05R\x06pathId\x12\x1d\n\nbest_route\x18\x08 \x01(\x08R\tbestRoute\x12\x1e\n\x0b\x61s_path_str\x18\t \x01(\x0cR\tasPathStr\x12 \n\x0cpath_orig_id\x18\n \x01(\x0cR\npathOrigId\x12\"\n\rnext_hop_addr\x18\x0b \x01(\x0cR\x0bnextHopAddr\x12\x42\n\x07\x61s_size\x18\x0c \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.BgpAsSizeR\x06\x61sSize\x12\x1d\n\necmp_route\x18\r \x01(\x08R\tecmpRoute\x12M\n\tpeer_addr\x18\x0e \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x08peerAddr\x12,\n\x12\x66lap_stats_flapcnt\x18\x0f \x01(\x05R\x10\x66lapStatsFlapcnt\x12,\n\x12\x66lap_stats_supprsd\x18\x10 \x01(\x08R\x10\x66lapStatsSupprsd\x12L\n\tis_active\x18\x11 \x01(\x0e\x32/.opi_api.network.cloud.v1alpha1.BgpNlriIsActiveR\x08isActive\x12\x14\n\x05stale\x18\x12 \x01(\x08R\x05stale\x12%\n\x0e\x66lap_starttime\x18\x13 \x01(\x05R\rflapStarttime\x12V\n\x0freason_not_best\x18\x14 \x01(\x0e\x32..opi_api.network.cloud.v1alpha1.BGPRouteReasonR\rreasonNotBest\x12\x19\n\x08\x65xt_comm\x18\x15 \x03(\x0cR\x07\x65xtComm\x12\x12\n\x04\x63omm\x18\x16 \x03(\x0cR\x04\x63omm\x12\x1d\n\nlocal_pref\x18\x17 \x01(\x05R\tlocalPref\x12\x45\n\x06origin\x18\x18 \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.BGPOriginAttrR\x06origin\x12\x1f\n\x0bmed_present\x18\x19 \x01(\x08R\nmedPresent\x12\x10\n\x03med\x18\x1a \x01(\rR\x03med\x12H\n\tpeer_type\x18\x1b \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.BgpPeerTypeR\x08peerType\"\x95\x02\n\x13\x42GPNLRIPrefixFilter\x12\x19\n\x08\x65xt_comm\x18\x01 \x01(\x0cR\x07\x65xtComm\x12\x12\n\x04vnid\x18\x02 \x01(\x05R\x04vnid\x12\x1d\n\nroute_type\x18\x03 \x01(\x05R\trouteType\x12K\n\x08next_hop\x18\x04 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x07nextHop\x12O\n\nip_address\x18\x05 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\tipAddress\x12\x12\n\x04\x62\x65st\x18\x06 \x01(\x08R\x04\x62\x65st\"\xa0\x01\n\x0c\x42GPAdjRibOut\x12\x44\n\x04spec\x18\x01 \x01(\x0b\x32\x30.opi_api.network.cloud.v1alpha1.BGPAdjRibOutSpecR\x04spec\x12J\n\x06status\x18\x02 \x01(\x0b\x32\x32.opi_api.network.cloud.v1alpha1.BGPAdjRibOutStatusR\x06status\"\x12\n\x10\x42GPAdjRibOutSpec\"\xa5\x04\n\x12\x42GPAdjRibOutStatus\x12M\n\tpeer_addr\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x08peerAddr\x12\x38\n\x03\x61\x66i\x18\x02 \x01(\x0e\x32&.opi_api.network.cloud.v1alpha1.BGPAfiR\x03\x61\x66i\x12;\n\x04safi\x18\x03 \x01(\x0e\x32\'.opi_api.network.cloud.v1alpha1.BGPSafiR\x04safi\x12\x16\n\x06prefix\x18\x04 \x01(\x0cR\x06prefix\x12\x1d\n\nprefix_len\x18\x05 \x01(\x05R\tprefixLen\x12L\n\x05state\x18\x06 \x01(\x0e\x32\x31.opi_api.network.cloud.v1alpha1.BgpAroAdvertStateB\x03\xe0\x41\x03R\x05state\x12\x42\n\x07\x61s_size\x18\x07 \x01(\x0e\x32).opi_api.network.cloud.v1alpha1.BgpAsSizeR\x06\x61sSize\x12\x1e\n\x0b\x61s_path_str\x18\x08 \x01(\x0cR\tasPathStr\x12\x12\n\x04\x63omm\x18\t \x03(\x0cR\x04\x63omm\x12\x19\n\x08\x65xt_comm\x18\n \x03(\x0cR\x07\x65xtComm\x12\x1f\n\x0bmed_present\x18\x0b \x01(\x08R\nmedPresent\x12\x10\n\x03med\x18\x0c \x01(\rR\x03med*X\n\x06\x42GPAfi\x12\x17\n\x13\x42GP_AFI_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x42GP_AFI_IPV4\x10\x01\x12\x10\n\x0c\x42GP_AFI_IPV6\x10\x02\x12\x11\n\rBGP_AFI_L2VPN\x10\x19*L\n\x07\x42GPSafi\x12\x18\n\x14\x42GP_SAFI_UNSPECIFIED\x10\x00\x12\x14\n\x10\x42GP_SAFI_UNICAST\x10\x01\x12\x11\n\rBGP_SAFI_EVPN\x10\x46*_\n\tBgpPeerRR\x12\x1b\n\x17\x42GP_PEER_RR_UNSPECIFIED\x10\x00\x12\x16\n\x12\x42GP_PEER_RR_CLIENT\x10\x01\x12\x1d\n\x19\x42GP_PEER_RR_MESHED_CLIENT\x10\x02*\x9a\x02\n\x13\x42gpPeerSessionState\x12&\n\"BGP_PEER_SESSION_STATE_UNSPECIFIED\x10\x00\x12\x1f\n\x1b\x42GP_PEER_SESSION_STATE_IDLE\x10\x01\x12\"\n\x1e\x42GP_PEER_SESSION_STATE_CONNECT\x10\x02\x12!\n\x1d\x42GP_PEER_SESSION_STATE_ACTIVE\x10\x03\x12#\n\x1f\x42GP_PEER_SESSION_STATE_OPENSENT\x10\x04\x12&\n\"BGP_PEER_SESSION_STATE_OPENCONFIRM\x10\x05\x12&\n\"BGP_PEER_SESSION_STATE_ESTABLISHED\x10\x06*_\n\tBgpAsSize\x12\x1b\n\x17\x42GP_AS_SIZE_UNSPECIFIED\x10\x00\x12\x19\n\x15\x42GP_AS_SIZE_TWO_OCTET\x10\x01\x12\x1a\n\x16\x42GP_AS_SIZE_FOUR_OCTET\x10\x02*\xd0\x04\n\x0b\x42GPAddrType\x12\x1d\n\x19\x42GP_ADDR_TYPE_UNSPECIFIED\x10\x00\x12\x16\n\x12\x42GP_ADDR_TYPE_IPV4\x10\x01\x12\x16\n\x12\x42GP_ADDR_TYPE_IPV6\x10\x02\x12\x16\n\x12\x42GP_ADDR_TYPE_NSAP\x10\x03\x12\x16\n\x12\x42GP_ADDR_TYPE_HDLC\x10\x04\x12\x19\n\x15\x42GP_ADDR_TYPE_BBN1822\x10\x05\x12\x19\n\x15\x42GP_ADDR_TYPE_IEEE802\x10\x06\x12\x16\n\x12\x42GP_ADDR_TYPE_E163\x10\x07\x12\x16\n\x12\x42GP_ADDR_TYPE_E164\x10\x08\x12\x15\n\x11\x42GP_ADDR_TYPE_F69\x10\t\x12\x16\n\x12\x42GP_ADDR_TYPE_X121\x10\n\x12\x15\n\x11\x42GP_ADDR_TYPE_IPX\x10\x0b\x12\x1b\n\x17\x42GP_ADDR_TYPE_APPLETALK\x10\x0c\x12\x1a\n\x16\x42GP_ADDR_TYPE_DECNETIV\x10\r\x12\x1b\n\x17\x42GP_ADDR_TYPE_BANYANVIN\x10\x0e\x12\x1b\n\x17\x42GP_ADDR_TYPE_E164_NSAP\x10\x0f\x12\x1a\n\x16\x42GP_ADDR_TYPE_IPV4_TNA\x10\x10\x12\x1a\n\x16\x42GP_ADDR_TYPE_IPV6_TNA\x10\x11\x12\x1a\n\x16\x42GP_ADDR_TYPE_NSAP_TNA\x10\x12\x12\x1a\n\x16\x42GP_ADDR_TYPE_VPN_IPV4\x10\x13\x12\x1a\n\x16\x42GP_ADDR_TYPE_VPN_IPV6\x10\x14\x12\x17\n\x13\x42GP_ADDR_TYPE_L2VPN\x10\x19*\xb9\x01\n\x0c\x42GPOperState\x12\x1e\n\x1a\x42GP_OPER_STATE_UNSPECIFIED\x10\x00\x12\x15\n\x11\x42GP_OPER_STATE_UP\x10\x01\x12\x17\n\x13\x42GP_OPER_STATE_DOWN\x10\x02\x12\x1b\n\x17\x42GP_OPER_STATE_GOING_UP\x10\x03\x12\x1d\n\x19\x42GP_OPER_STATE_GOING_DOWN\x10\x04\x12\x1d\n\x19\x42GP_OPER_STATE_ACT_FAILED\x10\x05*\xea\x01\n\x10\x42gpAddPathCapNeg\x12#\n\x1f\x42GP_ADD_PATH_CAP_NEG_SR_DISABLE\x10\x00\x12#\n\x1f\x42GP_ADD_PATH_CAP_NEG_SR_RECEIVE\x10\x01\x12 \n\x1c\x42GP_ADD_PATH_CAP_NEG_SR_SEND\x10\x02\x12 \n\x1c\x42GP_ADD_PATH_CAP_NEG_SR_BOTH\x10\x03\x12#\n\x1f\x42GP_ADD_PATH_CAP_NEG_SR_INHERIT\x10\x04\x12#\n\x1f\x42GP_ADD_PATH_CAP_NEG_SR_UNKNOWN\x10\x05*\xdc\x01\n\x14\x42GPClearRouteOptions\x12\'\n#BGP_CLEAR_ROUTE_OPTIONS_UNSPECIFIED\x10\x00\x12 \n\x1c\x42GP_CLEAR_ROUTE_OPTIONS_HARD\x10\x01\x12&\n\"BGP_CLEAR_ROUTE_OPTIONS_REFRESH_IN\x10\x02\x12\'\n#BGP_CLEAR_ROUTE_OPTIONS_REFRESH_OUT\x10\x03\x12(\n$BGP_CLEAR_ROUTE_OPTIONS_REFRESH_BOTH\x10\x04*[\n\x07NLRISrc\x12\x18\n\x14NLRI_SRC_UNSPECIFIED\x10\x00\x12\x11\n\rNLRI_SRC_PEER\x10\x01\x12\x10\n\x0cNLRI_SRC_AFM\x10\x02\x12\x11\n\rNLRI_SRC_SELF\x10\x03*\x99\x01\n\x0f\x42gpNlriIsActive\x12\"\n\x1e\x42GP_NLRI_IS_ACTIVE_UNSPECIFIED\x10\x00\x12\"\n\x1e\x42GP_NLRI_IS_ACTIVE_NOT_TRACKED\x10\x01\x12\x1f\n\x1b\x42GP_NLRI_IS_ACTIVE_INACTIVE\x10\x02\x12\x1d\n\x19\x42GP_NLRI_IS_ACTIVE_ACTIVE\x10\x03*\x99\x05\n\x0e\x42GPRouteReason\x12#\n\x1f\x42GP_ROUTE_REASON_NOT_CONSIDERED\x10\x00\x12\"\n\x1e\x42GP_ROUTE_REASON_ROUTE_IS_BEST\x10\x01\x12\x1b\n\x17\x42GP_ROUTE_REASON_WEIGHT\x10\x02\x12\x1f\n\x1b\x42GP_ROUTE_REASON_LOCAL_PREF\x10\x03\x12%\n!BGP_ROUTE_REASON_LCL_ORIG_PRFRRED\x10\x04\x12 \n\x1c\x42GP_ROUTE_REASON_AS_PATH_LEN\x10\x05\x12\x1b\n\x17\x42GP_ROUTE_REASON_ORIGIN\x10\x06\x12\x18\n\x14\x42GP_ROUTE_REASON_MED\x10\x07\x12#\n\x1f\x42GP_ROUTE_REASON_LOCAL_ORIG_TIE\x10\x08\x12%\n!BGP_ROUTE_REASON_EBGP_V_IBGP_PEER\x10\t\x12#\n\x1f\x42GP_ROUTE_REASON_ADMIN_DISTANCE\x10\n\x12%\n!BGP_ROUTE_REASON_PATH_TO_NEXT_CST\x10\x0b\x12\"\n\x1e\x42GP_ROUTE_REASON_PREF_EXISTING\x10\x0c\x12\x1f\n\x1b\x42GP_ROUTE_REASON_IDENTIFIER\x10\r\x12 \n\x1c\x42GP_ROUTE_REASON_CLUSTER_LEN\x10\x0e\x12#\n\x1f\x42GP_ROUTE_REASON_PEER_ADDR_TYPE\x10\x0f\x12\x1e\n\x1a\x42GP_ROUTE_REASON_PEER_ADDR\x10\x10\x12\x1e\n\x1a\x42GP_ROUTE_REASON_PEER_PORT\x10\x11\x12\x1c\n\x18\x42GP_ROUTE_REASON_PATH_ID\x10\x12*\x82\x01\n\rBGPOriginAttr\x12\x1f\n\x1b\x42GP_ORIGIN_ATTR_UNSPECIFIED\x10\x00\x12\x17\n\x13\x42GP_ORIGIN_ATTR_IGP\x10\x01\x12\x17\n\x13\x42GP_ORIGIN_ATTR_EGP\x10\x02\x12\x1e\n\x1a\x42GP_ORIGIN_ATTR_INCOMPLETE\x10\x03*t\n\x0b\x42gpPeerType\x12\x1d\n\x19\x42GP_PEER_TYPE_UNSPECIFIED\x10\x00\x12\x16\n\x12\x42GP_PEER_TYPE_NONE\x10\x01\x12\x16\n\x12\x42GP_PEER_TYPE_IBGP\x10\x02\x12\x16\n\x12\x42GP_PEER_TYPE_EBGP\x10\x03*\xd4\x01\n\x11\x42gpAroAdvertState\x12$\n BGP_ARO_ADVERT_STATE_UNSPECIFIED\x10\x00\x12#\n\x1f\x42GP_ARO_ADVERT_STATE_ADVERTISED\x10\x01\x12#\n\x1f\x42GP_ARO_ADVERT_STATE_SUPPRESSED\x10\x02\x12+\n\'BGP_ARO_ADVERT_STATE_PENDING_WITHDRAWAL\x10\x03\x12\"\n\x1e\x42GP_ARO_ADVERT_STATE_WITHDRAWN\x10\x04\x42i\n\x1eopi_api.network.cloud.v1alpha1B\x08\x42gpProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'network.cloud.bgp_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\010BgpProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_BGPROUTER'].fields_by_name['name']._loaded_options = None
  _globals['_BGPROUTER'].fields_by_name['name']._serialized_options = b'\340A\010'
  _globals['_BGPROUTER']._loaded_options = None
  _globals['_BGPROUTER']._serialized_options = b'\352AZ\n(opi_api.network.cloud.v1alpha1/BgpRouter\022\027bgpRouters/{bgp_router}*\nbgpRouters2\tbgpRouter'
  _globals['_BGPSTATUS'].fields_by_name['oper_state']._loaded_options = None
  _globals['_BGPSTATUS'].fields_by_name['oper_state']._serialized_options = b'\340A\003'
  _globals['_BGPPEER']._loaded_options = None
  _globals['_BGPPEER']._serialized_options = b'\352AP\n&opi_api.network.cloud.v1alpha1/BgpPeer\022\023bgpPeers/{bgp_peer}*\010bgpPeers2\007bgpPeer'
  _globals['_BGPPEERSPEC'].fields_by_name['state']._loaded_options = None
  _globals['_BGPPEERSPEC'].fields_by_name['state']._serialized_options = b'\340A\003'
  _globals['_BGPPEERSTATUS'].fields_by_name['session_state']._loaded_options = None
  _globals['_BGPPEERSTATUS'].fields_by_name['session_state']._serialized_options = b'\340A\003'
  _globals['_BGPPEERSTATUS'].fields_by_name['prev_session_state']._loaded_options = None
  _globals['_BGPPEERSTATUS'].fields_by_name['prev_session_state']._serialized_options = b'\340A\003'
  _globals['_BGPPEERSTATUS'].fields_by_name['oper_state']._loaded_options = None
  _globals['_BGPPEERSTATUS'].fields_by_name['oper_state']._serialized_options = b'\340A\003'
  _globals['_BGPPEERAF']._loaded_options = None
  _globals['_BGPPEERAF']._serialized_options = b'\352AV\n(opi_api.network.cloud.v1alpha1/BgpPeerAf\022\023bgpPeerAfs/{peeraf}*\nbgpPeerAfs2\tbgpPeerAf'
  _globals['_BGPADJRIBOUTSTATUS'].fields_by_name['state']._loaded_options = None
  _globals['_BGPADJRIBOUTSTATUS'].fields_by_name['state']._serialized_options = b'\340A\003'
  _globals['_BGPAFI']._serialized_start=8575
  _globals['_BGPAFI']._serialized_end=8663
  _globals['_BGPSAFI']._serialized_start=8665
  _globals['_BGPSAFI']._serialized_end=8741
  _globals['_BGPPEERRR']._serialized_start=8743
  _globals['_BGPPEERRR']._serialized_end=8838
  _globals['_BGPPEERSESSIONSTATE']._serialized_start=8841
  _globals['_BGPPEERSESSIONSTATE']._serialized_end=9123
  _globals['_BGPASSIZE']._serialized_start=9125
  _globals['_BGPASSIZE']._serialized_end=9220
  _globals['_BGPADDRTYPE']._serialized_start=9223
  _globals['_BGPADDRTYPE']._serialized_end=9815
  _globals['_BGPOPERSTATE']._serialized_start=9818
  _globals['_BGPOPERSTATE']._serialized_end=10003
  _globals['_BGPADDPATHCAPNEG']._serialized_start=10006
  _globals['_BGPADDPATHCAPNEG']._serialized_end=10240
  _globals['_BGPCLEARROUTEOPTIONS']._serialized_start=10243
  _globals['_BGPCLEARROUTEOPTIONS']._serialized_end=10463
  _globals['_NLRISRC']._serialized_start=10465
  _globals['_NLRISRC']._serialized_end=10556
  _globals['_BGPNLRIISACTIVE']._serialized_start=10559
  _globals['_BGPNLRIISACTIVE']._serialized_end=10712
  _globals['_BGPROUTEREASON']._serialized_start=10715
  _globals['_BGPROUTEREASON']._serialized_end=11380
  _globals['_BGPORIGINATTR']._serialized_start=11383
  _globals['_BGPORIGINATTR']._serialized_end=11513
  _globals['_BGPPEERTYPE']._serialized_start=11515
  _globals['_BGPPEERTYPE']._serialized_end=11631
  _globals['_BGPAROADVERTSTATE']._serialized_start=11634
  _globals['_BGPAROADVERTSTATE']._serialized_end=11846
  _globals['_BGPROUTER']._serialized_start=161
  _globals['_BGPROUTER']._serialized_end=420
  _globals['_BGPSPEC']._serialized_start=423
  _globals['_BGPSPEC']._serialized_end=611
  _globals['_BGPSTATUS']._serialized_start=614
  _globals['_BGPSTATUS']._serialized_end=890
  _globals['_BGPPEER']._serialized_start=893
  _globals['_BGPPEER']._serialized_end=1143
  _globals['_BGPPEERSPEC']._serialized_start=1146
  _globals['_BGPPEERSPEC']._serialized_end=1831
  _globals['_BGPPEERSTATUS']._serialized_start=1834
  _globals['_BGPPEERSTATUS']._serialized_end=4150
  _globals['_BGPPEERAF']._serialized_start=4153
  _globals['_BGPPEERAF']._serialized_end=4413
  _globals['_BGPPEERAFSPEC']._serialized_start=4416
  _globals['_BGPPEERAFSPEC']._serialized_end=5121
  _globals['_BGPMAXPREFIX']._serialized_start=5124
  _globals['_BGPMAXPREFIX']._serialized_end=5313
  _globals['_BGPMAXPREFIXRESTART']._serialized_start=5315
  _globals['_BGPMAXPREFIXRESTART']._serialized_end=5418
  _globals['_BGPROUTEMAP']._serialized_start=5420
  _globals['_BGPROUTEMAP']._serialized_end=5486
  _globals['_BGPPEERAFSTATUS']._serialized_start=5489
  _globals['_BGPPEERAFSTATUS']._serialized_end=5802
  _globals['_BGPNLRIPREFIX']._serialized_start=5805
  _globals['_BGPNLRIPREFIX']._serialized_end=5966
  _globals['_BGPNLRIPREFIXSPEC']._serialized_start=5969
  _globals['_BGPNLRIPREFIXSPEC']._serialized_end=6309
  _globals['_BGPNLRIPREFIXSTATUS']._serialized_start=6312
  _globals['_BGPNLRIPREFIXSTATUS']._serialized_end=7558
  _globals['_BGPNLRIPREFIXFILTER']._serialized_start=7561
  _globals['_BGPNLRIPREFIXFILTER']._serialized_end=7838
  _globals['_BGPADJRIBOUT']._serialized_start=7841
  _globals['_BGPADJRIBOUT']._serialized_end=8001
  _globals['_BGPADJRIBOUTSPEC']._serialized_start=8003
  _globals['_BGPADJRIBOUTSPEC']._serialized_end=8021
  _globals['_BGPADJRIBOUTSTATUS']._serialized_start=8024
  _globals['_BGPADJRIBOUTSTATUS']._serialized_end=8573
# @@protoc_insertion_point(module_scope)
