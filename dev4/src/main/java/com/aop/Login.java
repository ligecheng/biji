package com.aop;

import com.interiface.LoginInterface;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-24
 * Time: 15:30
 */
@Component
public class Login implements LoginInterface {
    @Override
    public void log() {
        System.out.println("this is Login log()");
    }

    @Override
    public void login() {
      System.out.println("this is Login login()");
    }
    public void init(){
        System.out.println("this is Login init()");
    }
}
