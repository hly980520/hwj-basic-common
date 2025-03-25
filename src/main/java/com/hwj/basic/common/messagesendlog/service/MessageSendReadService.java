package com.hwj.basic.common.messagesendlog.service;

import com.hwj.basic.common.messagesendlog.dto.MessageSendDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MessageSendReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<MessageSendDTO> queryById(Long id);

    /**
     * 根据用户id查询
     * @param memberId
     * @return
     */
    RpcResult<MessageSendDTO> queryByMemberId(Long memberId);

    /**
     * 根据电话号码查询
     * @param phoneNumber
     * @return
     */
    RpcResult<MessageSendDTO> queryByPhoneNumber(String phoneNumber);

    /**
     * 分页查询
     * @param dataPage 分页参数
     * @param messageSendDTO 查询参数
     * @return
     */
    RpcResult<DataPage<MessageSendDTO>> queryPage(DataPage<MessageSendDTO> dataPage, MessageSendDTO messageSendDTO);
}
