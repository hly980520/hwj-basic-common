package com.hwj.basic.common.memberoperlog.service;

import com.hwj.basic.common.memberoperlog.dto.MemberOperDTO;
import com.hwj.basic.result.RpcResult;

public interface MemberOperWriteService {

    /**
     * 新增
     * @param memberOperDTO
     * @return
     */
    RpcResult<MemberOperDTO> create(MemberOperDTO memberOperDTO);

    /**
     * 修改
     * @param memberOperDTO
     * @return
     */
    RpcResult<MemberOperDTO> update(MemberOperDTO memberOperDTO);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    RpcResult<MemberOperDTO> delete(Long id);


}
