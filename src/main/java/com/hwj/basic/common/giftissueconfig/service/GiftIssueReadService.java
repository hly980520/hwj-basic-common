package com.hwj.basic.common.giftissueconfig.service;

import com.hwj.basic.common.giftissueconfig.dto.GiftIssueDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface GiftIssueReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<GiftIssueDTO> queryById(Long id);

    /**
     * 根据用户id查询
     * @param memberId
     * @return
     */
    RpcResult<GiftIssueDTO> queryByMemberId(Long memberId);

    /**
     * 根据礼品信息查询
     * @param giftInfos
     * @return
     */
    RpcResult<GiftIssueDTO> queryByGiftInfos(String giftInfos);

    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param giftIssueDTO 查询参数
     * @return
     */
    RpcResult<DataPage<GiftIssueDTO>> queryPage(DataPage<GiftIssueDTO> dataPage, GiftIssueDTO giftIssueDTO);
}
