package com.hwj.basic.common.member.domain;

import com.alibaba.fastjson2.JSONObject;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * @Program: hwj-basic-common
 * @Description:
 * @author: wenjing.huang
 * @since: 2025-03-14 20:42:48
 */
public class Member implements Serializable {

    private static final long serialVersionUID = 4131328601213162133L;

    private Long id;

    private String nickname;

    private String loginAccount;

    private String loginPassword;

    private String countryCode;

    private String phoneNumber;

    private String registerWay;

    private String registerCredentials;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegisterWay() {
        return registerWay;
    }

    public void setRegisterWay(String registerWay) {
        this.registerWay = registerWay;
    }

    public String getRegisterCredentials() {
        return registerCredentials;
    }

    public void setRegisterCredentials(String registerCredentials) {
        this.registerCredentials = registerCredentials;
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
        return new StringJoiner(", ", Member.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nickname='" + nickname + "'")
                .add("loginAccount='" + loginAccount + "'")
                .add("loginPassword='" + loginPassword + "'")
                .add("countryCode='" + countryCode + "'")
                .add("phoneNumber='" + phoneNumber + "'")
                .add("registerWay='" + registerWay + "'")
                .add("registerCredentials='" + registerCredentials + "'")
                .add("features=" + features)
                .add("createdDate=" + createdDate)
                .add("createdBy='" + createdBy + "'")
                .add("updatedDate=" + updatedDate)
                .add("updatedBy='" + updatedBy + "'")
                .toString();
    }
}
