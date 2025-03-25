package com.hwj.basic.common.memberoperlog.service;

import com.hwj.basic.common.memberoperlog.dto.MemberOperDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

import java.time.LocalDateTime;

public interface MemberOperReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<MemberOperDTO> queryById(Long id);

    /**
     * 根据用户id查询
     * @param memberId
     * @return
     */
    RpcResult<MemberOperDTO> queryByMemberId(Long memberId);

    /**
     * 根据操作类型查询
     * @return
     */
    RpcResult<MemberOperDTO> queryByOperType(String operType);

    /**
     * 根据操作开始时间、操作结束时间查询
     * @param createdDate
     * @param updatedDate
     * @return
     */
    RpcResult<MemberOperDTO> queryByDate(LocalDateTime createdDate,LocalDateTime updatedDate);

    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param memberOperDTO 查询参数
     * @return RpcResult<DataPage<Member>>
     */
    RpcResult<DataPage<MemberOperDTO>> queryPage(DataPage<MemberOperDTO> dataPage, MemberOperDTO memberOperDTO);
}
