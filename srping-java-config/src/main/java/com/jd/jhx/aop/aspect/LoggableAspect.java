package com.jd.jhx.aop.aspect;

import com.jd.jhx.aop.annotation.Loggable;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by jihaixiao on 2016/11/12.
 */

@Aspect
@Component
public class LoggableAspect {

    @Pointcut("@annotation(com.jd.jhx.aop.annotation.Loggable)")
    public void annotationPointCut(){

    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        String methodName = method.getName();
        System.out.println("日志拦截：METHOD NAME:"+methodName);

    }

    @Before("execution(* com.jd.jhx.aop.service.impl.DemoMethodServiceImpl.* (..))")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截："+method.getName());
    }
}
