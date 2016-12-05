package com.jd.jhx.common.exception;

import com.jd.jhx.common.constants.ErrorCode;

/**
 * Created by jihaixiao on 2016/12/5.
 */
public abstract class BaseException extends RuntimeException{

    private String code;

    private String msg;

    public BaseException(ErrorCode errorCode,Object ... obj){
        this(errorCode,null,obj);
    }

    public BaseException(ErrorCode errorCode,Throwable e,Object ... obj){
        super(String.format(errorCode.getMsg(),obj),e);
        this.code = errorCode.name();
        if (obj == null || obj.length == 0){
            this.msg = String.format("%s","");
            return;
        }
        this.msg = String.format(errorCode.getMsg(),obj);
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
}
