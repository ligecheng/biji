package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-22
 * Time: 15:50
 */
public class MoccAop {
    public void before(){
        System.out.println("前置监听");
    }
    public void afterRurning(){
        System.out.println("运行成功");
    }
    public void afterThorwing(){
        System.out.println("运行异常");
    }
    public void after(){
        System.out.println("运行结束");
    }
    public void around(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("环绕通知1");
            Object o= joinPoint.proceed();
            System.out.println("环绕通知3");


    }catch (Throwable e){
        e.printStackTrace();
        }

    }

    public void aroundInit(ProceedingJoinPoint point,String name,int time)throws Throwable{
        System.out.println("环绕通知"+name+time);
        Object o=point.proceed();
    }
}
