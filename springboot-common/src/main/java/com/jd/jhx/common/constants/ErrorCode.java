package com.jd.jhx.common.constants;

/**
 * Created by jihaixiao on 2016/12/5.
 */
public enum ErrorCode {

    SYSTEM_EXCEPTION("系统错误"),
    PARAMETER_EMPTY("参数为空.%s");


    private String msg;

    ErrorCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
