package com.hwj.basic.common.membergift.service;

import com.hwj.basic.common.membergift.dto.MemberGiftDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MemberGiftReadService {


    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param memberGiftDTO 查询参数
     * @return
     */
    RpcResult<DataPage<MemberGiftDTO>> queryPage(DataPage<MemberGiftDTO> dataPage, MemberGiftDTO memberGiftDTO);
}
