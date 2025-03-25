package com.hwj.basic.common.messagesendlog.service;

import com.hwj.basic.common.messagesendlog.dto.MessageSendDTO;
import com.hwj.basic.result.RpcResult;

public interface MessageSendWriteService {

    /**
     * 新增消息发送
     * @param messageSendDTO
     * @return
     */
    RpcResult<MessageSendDTO> create(MessageSendDTO messageSendDTO);

    /**
     * 更新消息发送
     * @param messageSendDTO
     * @return
     */
    RpcResult<MessageSendDTO> update(MessageSendDTO messageSendDTO);

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    RpcResult<MessageSendDTO> delete(Long id);

}
