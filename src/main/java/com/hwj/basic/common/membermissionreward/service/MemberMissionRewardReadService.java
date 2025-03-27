package com.hwj.basic.common.membermissionreward.service;

import com.hwj.basic.common.membermissionreward.dto.MemberMissionRewardDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MemberMissionRewardReadService {

    RpcResult<MemberMissionRewardDTO> queryById(Long id);

    RpcResult<MemberMissionRewardDTO> queryByActivityTaskId(Long activityTaskId);

    RpcResult<MemberMissionRewardDTO> queryByMemberId(Long memberId);

    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param memberMissionRewardDTO 查询参数
     * @return
     */
    RpcResult<DataPage<MemberMissionRewardDTO>> queryPage(DataPage<MemberMissionRewardDTO> dataPage, MemberMissionRewardDTO memberMissionRewardDTO);
}
