package com.hwj.basic.common.membermissionchecklog.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class MemberMissionCheckLogDTO implements Serializable {
    private static final long serialVersionUID = 2383472596462608906L;

    private Long id;

    private Long missionId;

    private Long memberId;

    private Integer qualified;

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

    @Override
    public String toString() {
        return new StringJoiner(", ", MemberMissionCheckLogDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("missionId=" + missionId)
                .add("memberId=" + memberId)
                .add("qualified=" + qualified)
                .add("createdDate=" + createdDate)
                .add("createdBy=" + createdBy)
                .add("updatedDate=" + updatedDate)
                .add("updatedBy=" + updatedBy)
                .toString();
    }
}
