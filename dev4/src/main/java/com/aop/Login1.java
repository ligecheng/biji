package com.aop;

import com.interiface.LoginInterface;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-24
 * Time: 15:31
 */
@Component
public class Login1 implements LoginInterface{
     @Override
    public void log() {
        System.out.println("this is Login1 log()");
    }
 @Override
    public void login() {
      System.out.println("this is Login1 login()");
    }

    public void init(){
        System.out.print("this is login1 init()");
    }
}
