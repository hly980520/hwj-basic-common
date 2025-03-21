package com.hwj.basic.common.activity.service;

import com.hwj.basic.common.activity.dto.ActivityDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

import java.util.List;

public interface ActivityReadService {

    /**
     * 查询所有的活动信息
     * @return
     */
    RpcResult<List<ActivityDTO>> queryList();



    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param activityDTO 查询参数
     * @return RpcResult<DataPage<ActivityDTO>>
     */
    RpcResult<DataPage<ActivityDTO>> queryPage(DataPage<ActivityDTO> dataPage,ActivityDTO activityDTO);
}
