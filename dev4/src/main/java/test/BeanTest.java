package test;

import com.bean.Student;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jokerTank
 * Date: 2019-05-22
 * Time: 14:27
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanTest {
    private final static ApplicationContext app=new ClassPathXmlApplicationContext("classpath:application.xml");
    @Test
    public void test(){
        Student student=(Student)app.getBean("student");
    }
}
