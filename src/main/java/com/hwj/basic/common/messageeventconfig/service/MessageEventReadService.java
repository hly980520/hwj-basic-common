package com.hwj.basic.common.messageeventconfig.service;

import com.hwj.basic.common.messageeventconfig.dto.MessageEventDTO;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MessageEventReadService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    RpcResult<MessageEventDTO> queryById(Long id);

    /**
     * 根据事件名称查询
     * @param eventName
     * @return
     */
    RpcResult<MessageEventDTO> queryByEventName(String eventName);

    /**
     * 根据事件代码查询
     * @param eventCode
     * @return
     */
    RpcResult<MessageEventDTO> queryByEventCode(String eventCode);

    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param messageEventDTO 查询参数
     * @return RpcResult<DataPage<Member>>
     */
    RpcResult<DataPage<MessageEventDTO>> queryPage(DataPage<MessageEventDTO> dataPage, MessageEventDTO messageEventDTO);


}
