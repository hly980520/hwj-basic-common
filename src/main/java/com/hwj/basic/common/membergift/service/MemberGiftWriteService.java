package com.hwj.basic.common.membergift.service;

import com.hwj.basic.common.membergift.dto.MemberGiftDTO;
import com.hwj.basic.result.RpcResult;

public interface MemberGiftWriteService {

    /**
     * 新增
     * @param memberGiftDTO
     * @return
     */
    RpcResult<MemberGiftDTO> create(MemberGiftDTO memberGiftDTO);

    /**
     * 修改
     * @param memberGiftDTO
     * @return
     */
    RpcResult<MemberGiftDTO> update(MemberGiftDTO memberGiftDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    RpcResult<MemberGiftDTO> delete(Long id);
}
