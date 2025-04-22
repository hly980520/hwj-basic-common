package com.hwj.basic.common.gift.dto;

import com.alibaba.fastjson2.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class GiftDTO implements Serializable {

    private static final long serialVersionUID = -6084035222829050497L;

    private Long id;

    private String name;

    private Integer giftType;

    private Integer quantity;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGiftType() {
        return giftType;
    }

    public void setGiftType(Integer giftType) {
        this.giftType = giftType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        return new StringJoiner(", ", GiftDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("giftType=" + giftType)
                .add("quantity=" + quantity)
                .add("features=" + features)
                .add("createdDate=" + createdDate)
                .add("createdBy='" + createdBy + "'")
                .add("updatedDate=" + updatedDate)
                .add("updatedBy='" + updatedBy + "'")
                .toString();
    }
}
