package com.aop;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-22
 * Time: 15:50
 */
@Component("aopConfig")
public class AopConfig {

    public String say(){
        System.out.println("this is say");
//        throw new RuntimeException(" Save failed!");
        return "黎格成";
    }
    public int  init(String name,int time){

        return 1;
    }
}
