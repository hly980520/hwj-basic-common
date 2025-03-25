package com.hwj.basic.common.memberoperlog.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class MemberOperDTO implements Serializable {

    private static final long serialVersionUID = -5717328344716710524L;

    private Long id;

    private Long memberId;

    private String loginAccount;

    private String operationType;

    private String memberRealIp;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

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

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getMemberRealIp() {
        return memberRealIp;
    }

    public void setMemberRealIp(String memberRealIp) {
        this.memberRealIp = memberRealIp;
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
        return new StringJoiner(", ", MemberOperDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("memberId='" + memberId)
                .add("loginAccount='" + loginAccount + "'")
                .add("operationType='" + operationType + "'")
                .add("memberRealIp='" + memberRealIp + "'")
                .add("createdDate=" + createdDate)
                .add("updatedDate=" + updatedDate)
                .toString();
    }
}
