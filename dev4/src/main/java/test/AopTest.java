package test;

import com.aop.AopConfig;
import com.aop.Aopinterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Blob;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-22
 * Time: 16:08
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AopTest {
    private final static ApplicationContext app=new ClassPathXmlApplicationContext("classpath:config.xml");
    @Test
    public void test(){
        Aopinterface aopConfig=(Aopinterface) app.getBean("Aop1Cofig");
        aopConfig.filer();
    }

}
