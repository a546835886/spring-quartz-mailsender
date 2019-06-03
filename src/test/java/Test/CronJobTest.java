package Test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CronJobTest {
    @Test
    public void test1(){
        String[] configLocations = new String[]{"springMVC.xml"};
        //启动spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
        System.out.println("initContext successfully");
    }
}
