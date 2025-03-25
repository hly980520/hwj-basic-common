package com.hwj.basic.common.gift.service;

import com.hwj.basic.common.gift.dto.GiftDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface GiftReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<GiftDTO> queryById(Long id);

    /**
     * 根据礼品名称查询
     * @param name
     * @return
     */
    RpcResult<GiftDTO> queryByName(String name);

    /**
     * 根据礼品类型查询
     * @param giftType
     * @return
     */
    RpcResult<GiftDTO> queryByGiftType(Integer giftType);


    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param giftDTO 查询参数
     * @return RpcResult<DataPage<GiftDTO>>
     */
    RpcResult<DataPage<GiftDTO>> queryPage(DataPage<GiftDTO> dataPage, GiftDTO giftDTO);

}
