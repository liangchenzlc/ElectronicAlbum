
package com.coderedma.response;

import java.io.Serializable;

/**
 * 前后端响应数据对象[前后端传输协议]
 *
 * @param <T> 请求数据的对象类型
 */
public class ResponseResult<T> implements Serializable {
    // 请求是否成功
    private Boolean success;
    // 状态码
    private Integer staus;
    // 请求信息
    private String message;
    // 请求数据
    private T data;

    ResponseResult(Integer staus, String message) {
        this.staus = staus;
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
