package com.hwj.basic.common.messageeventconfig.service;

import com.hwj.basic.common.messageeventconfig.dto.MessageEventDTO;
import com.hwj.basic.result.RpcResult;

public interface MessageEventWriteService {

    /**
     * 新增消息事件配置
     * @param messageEventDTO
     * @return
     */
    RpcResult<MessageEventDTO> create(MessageEventDTO messageEventDTO);

    /**
     * 修改
     * @param messageEventDTO
     * @return
     */
    RpcResult<MessageEventDTO> update(MessageEventDTO messageEventDTO);

    /**
     * 删除
     * @param id
     * @return
     */
    RpcResult<MessageEventDTO> delete(Long id);

}
