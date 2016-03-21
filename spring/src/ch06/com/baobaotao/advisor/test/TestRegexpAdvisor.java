package ch06.com.baobaotao.advisor.test;

import ch06.com.baobaotao.advisor.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRegexpAdvisor {
    public static void main(String[] args) {
        String configPath = "ch06/com/baobaotao/advisor/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) ctx.getBean("waiter1");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
