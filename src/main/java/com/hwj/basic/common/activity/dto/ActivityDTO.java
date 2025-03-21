package com.hwj.basic.common.activity.dto;

import com.alibaba.fastjson2.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Program:
 * @Description:
 * @author: wenjing.huang
 * @since:
 */
public class ActivityDTO implements Serializable {

    private Long id;

    private String name;

    private Integer activityType;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
