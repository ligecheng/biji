package test;

import com.aop.AopConfig;
import com.aop.Login;
import com.aop.Login1;
import com.function.index;
import com.interiface.LoginInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-23
 * Time: 15:49
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeforeTest {
    private final static ApplicationContext app=new ClassPathXmlApplicationContext("classpath:application.xml");
    @Test
    public void Test(){
        index i=(index)app.getBean("index");
        i.say();
    }

    @Test
    public void test1(){

        AopConfig aopConfig=(AopConfig)app.getBean("aopConfig");
                LoginInterface s=(LoginInterface)app.getBean("login");
                s.log();
        aopConfig.init("name",1);
        aopConfig.say();

    }
    @Test
    public void test2(){
       LoginInterface login=(LoginInterface) app.getBean("login");
        login.login();
    }
}
