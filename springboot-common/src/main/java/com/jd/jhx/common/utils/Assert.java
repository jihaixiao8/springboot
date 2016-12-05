package com.jd.jhx.common.utils;

import com.jd.jhx.common.constants.ErrorCode;
import com.jd.jhx.common.exception.CheckException;

/**
 * Created by jihaixiao on 2016/12/5.
 */
public final class Assert {

    private Assert() {
    }

    public static void assertTrue(boolean condition, ErrorCode code,String msg){
        if (!condition){
            throw new CheckException(code,msg);
        }
    }

    public static void assertFalse(boolean condition,ErrorCode code,String msg){
        if (condition){
            throw new CheckException(code,msg);
        }
    }

    public static void assertNotNull(Object obj,ErrorCode code,String msg){
        assertFalse(obj == null,code ,msg);
    }

    public static void assertNull(Object obj,ErrorCode code,String msg){
        assertTrue(obj == null,code,msg);
    }

    public static void isRequired(Object obj,String fieldName){
        assertNotNull(obj,ErrorCode.PARAMETER_EMPTY,fieldName);
    }

}
