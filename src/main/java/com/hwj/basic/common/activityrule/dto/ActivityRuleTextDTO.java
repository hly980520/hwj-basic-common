package com.hwj.basic.common.activityrule.dto;

import java.io.Serializable;
import java.util.StringJoiner;

public class ActivityRuleTextDTO implements Serializable {
    private static final long serialVersionUID = 4349204397894688142L;

    private Long id;

    private Long activityId;

    private String ruleText;

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

    @Override
    public String toString() {
        return new StringJoiner(", ", ActivityRuleTextDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("activityId='" + activityId)
                .add("ruleText='" + ruleText + "'")
                .toString();
    }

}
