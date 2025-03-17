package com.hwj.basic.result;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @Program: hwj-user-center
 * @Description: RPC调用结果
 * @author: wenjing.huang
 * @since: 2025-03-14 17:14:26
 */
public class RpcResult<T> implements Serializable {

    private static final long serialVersionUID = 1396083878700603050L;

    private static final String SUCCESS_CODE = "200";

    private String code;

    private String msg;

    private T data;

    /**
     * 请求成功
     * @return RpcResponse<T>
     * @param <T> 泛型
     */
    public static <T> RpcResult<T> success() {
        RpcResult<T> response = new RpcResult<>();
        response.setCode(SUCCESS_CODE);
        return response;
    }

    /**
     * 请求成功
     * @param data 响应数据
     * @return RpcResponse<T>
     * @param <T> 泛型
     */
    public static <T> RpcResult<T> success(T data) {
        RpcResult<T> response = new RpcResult<>();
        response.setCode(SUCCESS_CODE);
        response.setData(data);
        return response;
    }

    /**
     * 请求失败
     * @param code 错误码
     * @param msg 错误信息
     * @return RpcResponse<T>
     * @param <T> 泛型
     */
    public static <T> RpcResult<T> failed(String code, String msg) {
        RpcResult<T> response = new RpcResult<>();
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }

    /**
     * 请求是否成功
     * @return true or false
     */
    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

    private RpcResult() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RpcResult.class.getSimpleName() + "[", "]")
                .add("code='" + code + "'")
                .add("msg='" + msg + "'")
                .add("data=" + data)
                .toString();
    }
}
