package com.hwj.basic.rocketmq.dto;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import java.io.Serializable;
import java.util.List;

public class RocketMessageDTO implements Serializable {

    private static final long serialVersionUID = 5424810224687391970L;

    /**
     * 消息id -- 默认为时间戳
     */
    private long messageId = System.currentTimeMillis();

    /**
     * 消息类型, 由生产者定义
     */
    private int messageType = 0;

    /**
     * 消息子类型<br>
     * 从属与消息类型的二级类型, 由生产者定义
     */
    private int messageSubType = 0;

    /**
     * 发送方
     */
    private String sender;

    /**
     * 业务数据
     */
    private final JSONObject data = new JSONObject();

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public int getMessageSubType() {
        return messageSubType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setMessageSubType(int messageSubType) {
        this.messageSubType = messageSubType;
    }

    public JSONObject getData() {
        return data;
    }

    public <T> T getDataValue(String key, Class<T> type) {
        return this.data.getObject(key, type);
    }

    public <T> List<T> getDataValueList(String key, Class<T> type) {
        return this.data.getList(key, type);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
