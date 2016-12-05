package com.jd.jhx.common.exception;

import com.jd.jhx.common.constants.ErrorCode;

/**
 * Created by jihaixiao on 2016/12/5.
 */
public class CheckException extends BaseException{

    public CheckException(ErrorCode errorCode, Object... obj) {
        super(errorCode, obj);
    }

    public CheckException(ErrorCode errorCode, Throwable e, Object... obj) {
        super(errorCode, e, obj);
    }
}
