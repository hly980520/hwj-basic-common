package com.hwj.basic.common.activitymember.service;

import com.hwj.basic.common.activitymember.dto.ActivityMemberDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

import java.util.List;

public interface ActivityMemberReadService {

    /**
     * 根据id来查询活动用户
     */
    RpcResult<ActivityMemberDTO> queryById(Long id);

    /**
     * 根据用户id来查询
     */
    RpcResult<ActivityMemberDTO> queryByMemberId(Long memberId);

    /**
     * 根据活动id来查询
     */
    RpcResult<ActivityMemberDTO> queryByActivityId(Long activityId);


    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param activityMemberDTO 查询参数
     * @return RpcResult<DataPage<Member>>
     */
    RpcResult<DataPage<ActivityMemberDTO>> queryPage(DataPage<ActivityMemberDTO> dataPage, ActivityMemberDTO activityMemberDTO);
}
