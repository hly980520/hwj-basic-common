package com.hwj.basic.common.membermissionreward.dto;

import com.alibaba.fastjson2.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class MemberMissionRewardDTO implements Serializable {

    private static final long serialVersionUID = -683149803769625320L;

    private Long id;

    private Long activityTaskId;

    private Long memberId;

    private String rewardIds;

    private Integer sendType;

    private Integer sendStatus;

    private LocalDateTime sendTime;

    private Long sourceId;

    private JSONObject features;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime updatedDate;

    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityTaskId() {
        return activityTaskId;
    }

    public void setActivityTaskId(Long activityTaskId) {
        this.activityTaskId = activityTaskId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getRewardIds() {
        return rewardIds;
    }

    public void setRewardIds(String rewardIds) {
        this.rewardIds = rewardIds;
    }


    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public JSONObject getFeatures() {
        return features;
    }

    public void setFeatures(JSONObject features) {
        this.features = features;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MemberMissionRewardDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("activityTaskId=" + activityTaskId)
                .add("memberId=" + memberId)
                .add("rewardIds='" + rewardIds + "'")
                .add("sendType=" + sendType)
                .add("sendStatus=" + sendStatus)
                .add("sendTime=" + sendTime)
                .add("sourceId=" + sourceId)
                .add("features=" + features)
                .add("createdDate=" + createdDate)
                .add("createdDate=" + createdBy + "'")
                .add("updatedDate=" + updatedDate)
                .add("updatedBy=" + updatedBy + "'")
                .toString();
    }
}
