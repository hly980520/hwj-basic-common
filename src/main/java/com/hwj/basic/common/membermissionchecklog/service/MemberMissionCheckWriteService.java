package com.hwj.basic.common.membermissionchecklog.service;

import com.hwj.basic.common.membermissionchecklog.dto.MemberMissionCheckLogDTO;
import com.hwj.basic.result.RpcResult;

public interface MemberMissionCheckWriteService {

    RpcResult<MemberMissionCheckLogDTO> create(MemberMissionCheckLogDTO memberMissionCheckLogDTO);

    RpcResult<MemberMissionCheckLogDTO> update(MemberMissionCheckLogDTO memberMissionCheckLogDTO);

    RpcResult<MemberMissionCheckLogDTO> delete(Long id);
}
