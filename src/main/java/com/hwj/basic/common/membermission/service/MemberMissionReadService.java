package com.hwj.basic.common.membermission.service;

import com.hwj.basic.common.membermission.dto.MemberMissionDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MemberMissionReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<MemberMissionDTO> queryById(Long id);

    /**
     * 根据任务id查询
     * @param missionId
     * @return
     */
    RpcResult<MemberMissionDTO> queryByMissionId(Long missionId);

    /**
     * 根据用户id查询
     * @param memberId
     * @return
     */
    RpcResult<MemberMissionDTO> queryByMemberId(Long memberId);


    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param memberMissionDTO 查询参数
     * @return
     */
    RpcResult<DataPage<MemberMissionDTO>> queryPage(DataPage<MemberMissionDTO> dataPage, MemberMissionDTO memberMissionDTO);
}
