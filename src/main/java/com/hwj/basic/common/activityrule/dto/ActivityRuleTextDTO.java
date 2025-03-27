package com.hwj.basic.common.activityrule.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class ActivityRuleTextDTO implements Serializable {
    private static final long serialVersionUID = 4349204397894688142L;

    private Long id;

    private Long activityId;

    private String ruleText;

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

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getRuleText() {
        return ruleText;
    }

    public void setRuleText(String ruleText) {
        this.ruleText = ruleText;
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
        return new StringJoiner(", ", ActivityRuleTextDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("activityId='" + activityId)
                .add("ruleText='" + ruleText + "'")
                .add("createdDate='" + createdDate)
                .add("createdBy='" + createdBy + "'")
                .add("updatedDate='" + updatedDate)
                .add("updatedBy='" + updatedBy + "'")
                .toString();
    }

}
