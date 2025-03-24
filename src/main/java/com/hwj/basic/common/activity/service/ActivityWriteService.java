package com.hwj.basic.common.activity.service;

import com.hwj.basic.common.activity.dto.ActivityDTO;
import com.hwj.basic.result.RpcResult;

import java.util.List;

public interface ActivityWriteService {

    /**
     * 创建新活动
     * @param activityDTO
     * @return
     */
    RpcResult<ActivityDTO> create(ActivityDTO activityDTO);

    /**
     * 根据活动id来删除活动
     * @param id
     * @return
     */
    RpcResult<ActivityDTO> deletedById(Long id);

    /**
     * 更新活动
     * @param activityDTO
     * @return
     */
    RpcResult<ActivityDTO> update(ActivityDTO activityDTO);
}
