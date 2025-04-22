package com.hwj.basic.common.member.service;

import com.hwj.basic.common.member.domain.Member;
import com.hwj.basic.common.member.params.MemberQuery;
import com.hwj.basic.mybatis.DataPage;
import com.hwj.basic.result.RpcResult;

public interface MemberReadService {

    /**
     * 根据用户id查询
     * @param id 记录id
     * @return RpcResult<Member>
     */
    RpcResult<Member> queryById(Long id);

    /**
     * 根据用户账号查询
     * @param loginAccount 用户账号
     * @return RpcResult<Member>
     */
    RpcResult<Member> queryByLoginAccount(String loginAccount);

    /**
     * 根据用户区号+手机号码查询
     * @param countryCode 区号
     * @param phoneNumber 手机号码
     * @return RpcResult<Member>
     */
    RpcResult<Member> queryByPhoneNumber(String countryCode, String phoneNumber);


    /**
     * 分页条件查询
     * @param dataPage 分页参数
     * @param params 查询参数
     * @return RpcResult<DataPage<Member>>
     */
    RpcResult<DataPage<Member>> queryPage(DataPage<Member> dataPage, MemberQuery params);

}
