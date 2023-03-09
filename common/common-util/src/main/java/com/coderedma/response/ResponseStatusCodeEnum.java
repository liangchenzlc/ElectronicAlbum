package com.coderedma.response;

/***
 * 响应状态码枚举类
 */
public enum ResponseStatusCodeEnum {

    SUCCESS(200, "OK", "操作成功"),

    BAD_REQUEST(400, "Bad Request", "请求错误，请修正请求"),

    UNAUTHORIZED(401, "Unauthorized", "没有被授权或者授权已经失效"),

    FORBIDDEN(403, "Forbidden", "请求被理解，但是拒绝执行"),

    NOT_FOUND(404, "Not Found", "资源未找到"),

    METHOD_NOT_ALLOWED(405, "Method Not Allowed", "请求方法不允许被执行"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "服务器内部错误");

    private Integer code;
    private String enMessage;
    private String zhMessage;
    ResponseStatusCodeEnum(Integer code, String enMessage, String zhMessage) {
    }

    public Integer getCode() {
        return code;
    }

    public String getEnMessage() {
        return enMessage;
    }

    public String getZhMessage() {
        return zhMessage;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setEnMessage(String enMessage) {
        this.enMessage = enMessage;
    }

    public void setZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
    }
}
