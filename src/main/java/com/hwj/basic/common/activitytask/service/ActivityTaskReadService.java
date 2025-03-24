package com.hwj.basic.common.activitytask.service;

import com.hwj.basic.common.activitytask.dto.ActivityTaskDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface ActivityTaskReadService {

    /**
     * 根据id查询活动任务
     * @param id
     * @return
     */
    RpcResult<ActivityTaskDTO> queryById(Long id);

    /**
     * 根据活动任务名称来查询
     * @param name
     * @return
     */
    RpcResult<ActivityTaskDTO> queryByName(String name);

    /**
     * 根据活动id来查询
     * @param activityId
     * @return
     */
    RpcResult<ActivityTaskDTO> queryByActivityId(Long activityId);

    /**
     * 根据任务状态来查询
     * @param status
     * @return
     */
    RpcResult<ActivityTaskDTO> queryByStatus(Integer status);

    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param activityTaskDTO 查询参数
     * @return RpcResult<DataPage<Member>>
     */
    RpcResult<DataPage<ActivityTaskDTO>> queryPage(DataPage<ActivityTaskDTO> dataPage, ActivityTaskDTO activityTaskDTO);

}
