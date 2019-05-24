package com.aop;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-23
 * Time: 11:42
 */
public class Aop implements Aopinterface{
    @Override
    public void filer() {
        System.out.println("接口通知");
    }
}
