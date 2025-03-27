package com.hwj.basic.common.membermissionreward.service;

import com.hwj.basic.common.membermissionreward.dto.MemberMissionRewardDTO;
import com.hwj.basic.result.RpcResult;

public interface MemberMissionRewardWriteService {

    /**
     * 新增
     * @param memberMissionRewardDTO
     * @return
     */
    RpcResult<MemberMissionRewardDTO> create(MemberMissionRewardDTO memberMissionRewardDTO);

    /**
     * 修改
     * @param memberMissionRewardDTO
     * @return
     */
    RpcResult<MemberMissionRewardDTO> update(MemberMissionRewardDTO memberMissionRewardDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    RpcResult<MemberMissionRewardDTO> delete(Long id);
}
