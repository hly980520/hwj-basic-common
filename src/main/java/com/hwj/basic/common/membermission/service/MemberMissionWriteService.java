package com.hwj.basic.common.membermission.service;

import com.hwj.basic.common.membermission.dto.MemberMissionDTO;
import com.hwj.basic.result.RpcResult;

public interface MemberMissionWriteService {

    /**
     * 新增
     * @param memberMissionDTO
     * @return
     */
    RpcResult<MemberMissionDTO> create(MemberMissionDTO memberMissionDTO);

    /**
     * 修改
     * @param memberMissionDTO
     * @return
     */
    RpcResult<MemberMissionDTO> update(MemberMissionDTO memberMissionDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    RpcResult<MemberMissionDTO> delete(Long id);

}
