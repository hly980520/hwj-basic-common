package com.hwj.basic.common.activity.service;

import com.hwj.basic.common.activity.dto.ActivityDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

import java.util.List;

public interface ActivityReadService {

    /**
     * 根据活动id来查询
     * @param id
     * @return
     */
    RpcResult<ActivityDTO> queryById(Long id);

    /**
     * 根据活动名称来查询
     * @param name
     * @return
     */
    RpcResult<ActivityDTO> queryByName(String name);

    /**
     * 根据活动类型来查询
     * @param type
     * @return
     */
    RpcResult<ActivityDTO> queryByType(Integer type);

    /**
     * 根据活动状态来查询 [0:草稿 1:上线 2:下线]
     * @param status
     * @return
     */
    RpcResult<ActivityDTO> queryByStatus(Integer status);

    /**
     * 查询所有的活动信息 活动状态不能是0
     * @return
     */
    RpcResult<List<ActivityDTO>> queryList(Integer status);

    /**
     * 根据id批量查询
     * @param ids
     * @return
     */
    RpcResult<List<ActivityDTO>> queryActivityList(List<Long> ids);



    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param activityDTO 查询参数
     * @return RpcResult<DataPage<ActivityDTO>>
     */
    RpcResult<DataPage<ActivityDTO>> queryPage(DataPage<ActivityDTO> dataPage,ActivityDTO activityDTO);
}
