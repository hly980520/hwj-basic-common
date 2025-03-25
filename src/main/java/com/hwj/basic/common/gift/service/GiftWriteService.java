package com.hwj.basic.common.gift.service;

import com.hwj.basic.common.gift.dto.GiftDTO;
import com.hwj.basic.result.RpcResult;

public interface GiftWriteService {

    /**
     * 创建礼品
     * @param giftDTO
     * @return
     */
    RpcResult<GiftDTO> create(GiftDTO giftDTO);

    /**
     * 修改礼品
     * @param giftDTO
     * @return
     */
    RpcResult<GiftDTO> update(GiftDTO giftDTO);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    RpcResult<GiftDTO> delete(Long id);

}
