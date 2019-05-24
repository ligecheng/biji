package com.aop1;

import com.aop.AopConfig;
import com.bean.Config;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-23
 * Time: 15:34
 */

@Component
@Aspect
public class Aop1Cofig {


    @Pointcut(value = "execution(* com.aop.AopConfig.init(String,int) )   ")
    public void pointcut() {}
    @Pointcut("within(com.aop.AopConfig)")
    public void pointcut1(){}
    @Pointcut("this(com.interiface.LoginInterface)")
    public void pointcut2(){}
    @Before("pointcut2()")
    public void before2(){
        System.out.println("####this");
    }
//    @Before("pointcut1()")
//    public void before1(){
//
//
//
//        System.out.println("#######B66"+);
//    }
//    @Before(value = "execution(* com.aop.AopConfig.init(String,int) ) and args(name,time)")
//    public void before(String name,int time){
//        System.out.println("前置通知");
//          System.out.println(name+time);
//
//
//    }

//    @AfterReturning(pointcut="pointcut()",returning="val")
//    public void runing(Object val)
//    {
//        System.out.println("返回结果"+val);
//        System.out.println("运行过后");
//
//    }
//    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
//    public void afterThow(RuntimeException e){
//            System.out.println("afterThrowing"+e.getMessage());
//    }
//    @After("pointcut()")
//    public void after(){
//        System.out.println("after.");
//    }
//    @Around(value = "pointcut()")
//    public Object around(ProceedingJoinPoint point )throws Throwable{
//        Object o=null;
//
//
//        o=point.proceed();
//
//        System.out.println("环绕通知内容"+o);
//        return o;
//    }
}
