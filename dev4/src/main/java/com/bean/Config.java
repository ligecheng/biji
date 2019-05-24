package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-22
 * Time: 14:21
 */
@Configuration
public class Config {



    @Bean
    public StudentOne studentOne(){return new StudentOne();  }
    @Bean
    public StudentTwo studentTwo(){
        return new StudentTwo();

    }
    @Bean(name ="student")
    public Student student(){
        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());
        return new StudentOne();
    }
    @Autowired
    @Qualifier("studentOne")
    private Student<String>s1;
    @Autowired
    @Qualifier("studentTwo")
    private Student<Integer>s2;
}
