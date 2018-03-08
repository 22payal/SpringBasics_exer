package spring.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("question1Config.xml");

        Database database = (Database) applicationContext.getBean("Database",Database.class);

        System.out.println(database);
    }
}
