package com.hwj.basic.common.giftissueconfig.service;

import com.hwj.basic.common.giftissueconfig.dto.GiftIssueDTO;
import com.hwj.basic.result.RpcResult;

public interface GiftIssueWriteService {

    /**
     * 新增
     * @param giftIssueDTO
     * @return
     */
    RpcResult<GiftIssueDTO> create(GiftIssueDTO giftIssueDTO);

    /**
     * 修改
     * @param giftIssueDTO
     * @return
     */
    RpcResult<GiftIssueDTO> update(GiftIssueDTO giftIssueDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    RpcResult<GiftIssueDTO> delete(Long id);

}
