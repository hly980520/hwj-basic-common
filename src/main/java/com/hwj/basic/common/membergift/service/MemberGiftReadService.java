package com.hwj.basic.common.membergift.service;

import com.hwj.basic.common.membergift.dto.MemberGiftDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MemberGiftReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<MemberGiftDTO> queryById(Long id);

    /**
     * 根据用户id查询
     * @param memberId
     * @return
     */
    RpcResult<MemberGiftDTO> queryByMemberId(Long memberId);

    /**
     * 根据礼品id查询
     * @param giftId
     * @return
     */
    RpcResult<MemberGiftDTO> queryByGiftId(Long giftId);

    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param memberGiftDTO 查询参数
     * @return
     */
    RpcResult<DataPage<MemberGiftDTO>> queryPage(DataPage<MemberGiftDTO> dataPage, MemberGiftDTO memberGiftDTO);
}
