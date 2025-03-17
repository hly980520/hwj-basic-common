package com.hwj.basic.exception;

import com.hwj.basic.result.RpcResult;

import java.util.StringJoiner;

/**
 * @Program: hwj-basic-common
 * @Description: 业务异常
 * @author: wenjing.huang
 * @since: 2025-03-17 10:10:27
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -1157152867245207562L;
    //错误码
    private final String errorCode;

    //错误信息
    private final String errorMsg;

    public BusinessException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    /**
     * 转Rpc结果
     *
     * @return RpcResult<?>
     */
    public RpcResult<?> toRpcResult() {
        return RpcResult.failed(errorCode, errorMsg);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BusinessException.class.getSimpleName() + "[", "]")
                .add("errorCode='" + errorCode + "'")
                .add("errorMsg='" + errorMsg + "'")
                .toString();
    }
}
