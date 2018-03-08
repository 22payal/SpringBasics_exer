package spring.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainfile {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question5Config.xml");

        Complex complex = (Complex) applicationContext.getBean("complexBean", Complex.class);
        System.out.println(complex);
    }

}
