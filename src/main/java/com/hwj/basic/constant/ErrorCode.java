package com.hwj.basic.constant;


import com.hwj.basic.exception.BusinessException;
import com.hwj.basic.result.RpcResult;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Program: hwj
 * @Description: 错误码
 * @author: peng.huang
 * @since: 2025-03-17 15:25:13
 */
public class ErrorCode implements Serializable {
    private static final long serialVersionUID = -1092800927085295305L;

    public static final ErrorCode PARAMS_MISS = new ErrorCode("10000001","Miss Required Parameters");

    public static final ErrorCode PARAMS_INVALID = new ErrorCode("10000002","Parameters Is Invalid");

    public static final ErrorCode INSERT_FAILED = new ErrorCode("10000003","Insert Failed");

    public static final ErrorCode UPDATE_FAILED = new ErrorCode("10000004","Update Failed");

    public static final ErrorCode DELETE_FAILED = new ErrorCode("10000005","Delete Failed");

    public static final ErrorCode SYSTEM_EXCEPTION = new ErrorCode("10000006","System Exception");



    /**
     * 错误码code
     */
    private String errCode;

    /**
     * 错误码msg
     */
    private String errMsg;

    public <T> RpcResult<T> toRpcResult() {
        return RpcResult.failed(errCode, errMsg);
    }

    public BusinessException toBusinessException() {
        return new BusinessException(errCode, errMsg);
    }

    private ErrorCode(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ErrorCode.class.getSimpleName() + "[", "]")
                .add("errCode='" + errCode + "'")
                .add("errMsg='" + errMsg + "'")
                .toString();
    }
}
