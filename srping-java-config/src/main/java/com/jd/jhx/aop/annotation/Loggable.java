package com.jd.jhx.aop.annotation;

import java.lang.annotation.*;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Loggable {

}
