package com.hwj.basic.common.membermissionchecklog.service;

import com.hwj.basic.common.membermissionchecklog.dto.MemberMissionCheckLogDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MemberMissionCheckReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<MemberMissionCheckLogDTO> queryById(Long id);

    /**
     * 根据任务id查询
     * @param missionId
     * @return
     */
    RpcResult<MemberMissionCheckLogDTO> queryByMissionId(Long missionId);

    /**
     * 根据用户id查询
     * @param memberId
     * @return
     */
    RpcResult<MemberMissionCheckLogDTO> queryByMemberId(Long memberId);

    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param memberMissionCheckLogDTO 查询参数
     * @return
     */
    RpcResult<DataPage<MemberMissionCheckLogDTO>> queryPage(DataPage<MemberMissionCheckLogDTO> dataPage, MemberMissionCheckLogDTO memberMissionCheckLogDTO);

}
