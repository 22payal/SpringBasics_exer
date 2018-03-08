package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("question6aConfig.xml");

       Restaurant res1 = (Restaurant) applicationContext.getBean("BeanName");

        System.out.println("using By Name");
       res1.getHotDrink().prepareHotDrink();


       ApplicationContext applicationContext1= new ClassPathXmlApplicationContext("question6bConfig.xml");

       Restaurant res2 = (Restaurant) applicationContext1.getBean("BeanType");


        System.out.println("using By Type");
        res2.getHotDrink().prepareHotDrink();

        ApplicationContext applicationContext2= new ClassPathXmlApplicationContext("question6bConfig.xml");

        Restaurant2 res = (Restaurant2) applicationContext2.getBean("BeanConstructor",Restaurant2.class);


        System.out.println("using By Constructor");
        res.getHotDrink().prepareHotDrink();


    }
}
