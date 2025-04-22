package com.hwj.basic.common.member.params;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 *
 * @Program: hwj
 * @Description: 用户信息查询参数
 * @author: peng.huang
 * @since: 2025-04-22 14:46:24
 */
public class MemberQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nickname;

    private String loginAccount;

    private String countryCode;

    private String phoneNumber;

    private LocalDateTime createdDateStart;

    private LocalDateTime createdDateEnd;

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

    public LocalDateTime getCreatedDateStart() {
        return createdDateStart;
    }

    public void setCreatedDateStart(LocalDateTime createdDateStart) {
        this.createdDateStart = createdDateStart;
    }

    public LocalDateTime getCreatedDateEnd() {
        return createdDateEnd;
    }

    public void setCreatedDateEnd(LocalDateTime createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MemberQuery.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nickname='" + nickname + "'")
                .add("loginAccount='" + loginAccount + "'")
                .add("countryCode='" + countryCode + "'")
                .add("phoneNumber='" + phoneNumber + "'")
                .add("createdDateStart=" + createdDateStart)
                .add("createdDateEnd=" + createdDateEnd)
                .toString();
    }
}
