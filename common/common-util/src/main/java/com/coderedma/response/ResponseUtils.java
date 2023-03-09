package com.coderedma.response;

/**
 * 请求响应工具类
 */
public class ResponseUtils {
    /**
     * 响应成功
     * @param object 数据对象
     * @return 返回响应成功对象
     */
    public static ResponseResult success(Object object) {
        ResponseResult result = new ResponseResult(
                ResponseStatusCodeEnum.SUCCESS.getCode(),
                ResponseStatusCodeEnum.SUCCESS.getZhMessage());
        result.setSuccess(true);
        result.setData(object);
        return result;
    }

    /**
     * 404未找到
     * @return 响应未找到
     */
    public static ResponseResult notFound() {
        ResponseResult result = new ResponseResult(
                ResponseStatusCodeEnum.NOT_FOUND.getCode(),
                ResponseStatusCodeEnum.NOT_FOUND.getZhMessage()
        );
        result.setSuccess(false);
        result.setData(null);
        return result;
    }

    /**
     * 服务器内部异常
     * @return 服务器异常对象
     */
    public static ResponseResult serverError() {
        ResponseResult result = new ResponseResult(
                ResponseStatusCodeEnum.INTERNAL_SERVER_ERROR.getCode(),
                ResponseStatusCodeEnum.INTERNAL_SERVER_ERROR.getZhMessage()
        );
        result.setSuccess(false);
        return result;
    }
}
