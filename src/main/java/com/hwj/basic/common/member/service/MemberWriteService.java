package com.hwj.basic.common.member.service;

import com.hwj.basic.common.member.domain.Member;
import com.hwj.basic.result.RpcResult;

public interface MemberWriteService {

    /**
     * 创建用户
     * @param member 创建参数
     * @return RpcResult<Member>
     */
    RpcResult<Member> create(Member member);

    /**
     * 更新用户
     * @param member 更新参数
     * @return RpcResult<Member>
     */
    RpcResult<Member> update(Member member);

    /**
     * 删除用户
     * @param id
     * @return
     */
    RpcResult<Member> delete(Long id);
}
