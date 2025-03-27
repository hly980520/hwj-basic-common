package com.hwj.basic.common.membergift.dto;

import com.alibaba.fastjson2.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class MemberGiftDTO implements Serializable {

    private static final long serialVersionUID = 5129610026280375324L;

    private Long id;

    private Long memberId;

    private Long giftId;

    private Integer giftType;

    private Integer status;

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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public Integer getGiftType() {
        return giftType;
    }

    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return new StringJoiner(", ", MemberGiftDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("memberId=" + memberId)
                .add("giftId=" + giftId)
                .add("giftType=" + giftType)
                .add("status=" + status)
                .add("sourceId=" + sourceId)
                .add("features=" + features)
                .add("createdDate=" + createdDate)
                .add("createdBy=" + createdBy + "'")
                .add("updatedDate=" + updatedDate)
                .add("updatedBy=" + updatedBy + "'")
                .toString();
    }
}
