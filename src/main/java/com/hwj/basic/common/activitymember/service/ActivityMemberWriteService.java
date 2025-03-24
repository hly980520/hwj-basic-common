package com.hwj.basic.common.activitymember.service;

import com.hwj.basic.common.activity.dto.ActivityDTO;
import com.hwj.basic.common.activitymember.dto.ActivityMemberDTO;
import com.hwj.basic.result.RpcResult;

public interface ActivityMemberWriteService {

    /**
     * 根据id修改状态
     * @param id
     * @return
     */
    RpcResult<ActivityMemberDTO> updateStatus(Long id);

    /**
     * 修改活动用户
     * @param activityMemberDTO
     * @return
     */
    RpcResult<ActivityMemberDTO> update(ActivityMemberDTO activityMemberDTO);


}
