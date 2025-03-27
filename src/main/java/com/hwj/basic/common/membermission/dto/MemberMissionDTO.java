package com.hwj.basic.common.membermission.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class MemberMissionDTO implements Serializable {
    private static final long serialVersionUID = 8210131352169249127L;

    private Long id;

    private Long missionId;

    private Long memberId;

    private Integer qualified;

    private LocalDateTime qualifiedTime;

    private Integer achievable;

    private Integer issuableReward;

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

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getQualified() {
        return qualified;
    }

    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    public LocalDateTime getQualifiedTime() {
        return qualifiedTime;
    }

    public void setQualifiedTime(LocalDateTime qualifiedTime) {
        this.qualifiedTime = qualifiedTime;
    }

    public Integer getAchievable() {
        return achievable;
    }

    public void setAchievable(Integer achievable) {
        this.achievable = achievable;
    }

    public Integer getIssuableReward() {
        return issuableReward;
    }

    public void setIssuableReward(Integer issuableReward) {
        this.issuableReward = issuableReward;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MemberMissionDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("missionId=" + missionId)
                .add("memberId=" + memberId)
                .add("qualified=" + qualified)
                .add("qualifiedTime=" + qualifiedTime)
                .add("achievable=" + achievable)
                .add("issuableReward=" + issuableReward)
                .add("createdDate=" + createdDate)
                .add("createdDate=" + createdBy + "'")
                .add("updatedDate=" + updatedDate)
                .add("createdDate=" + updatedBy + "'")
                .toString();
    }
}
