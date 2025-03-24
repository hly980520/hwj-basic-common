package com.hwj.basic.common.activitytask.service;

import com.hwj.basic.common.activitytask.dto.ActivityTaskDTO;
import com.hwj.basic.result.RpcResult;

public interface ActivityTaskWriteService {

    /**
     * 新增活动任务
     * @param activityTaskDTO
     * @return
     */
    RpcResult<ActivityTaskDTO> create(ActivityTaskDTO activityTaskDTO);

    /**
     * 修改活动任务
     * @param activityTaskDTO
     * @return
     */
    RpcResult<ActivityTaskDTO> update(ActivityTaskDTO activityTaskDTO);

    /**
     * 根据id删除活动任务
     */
    RpcResult<ActivityTaskDTO> deleted(Long id);

}
