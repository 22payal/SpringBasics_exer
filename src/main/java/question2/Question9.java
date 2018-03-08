package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question9 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("question9Config.xml");

     Restaurant4 res = (Restaurant4) applicationContext.getBean("AutowireSetter");

        System.out.println("using autowire setter method");

        res.getHotDrink().prepareHotDrink();

        System.out.println("........................");

        Restaurant4 res1 = (Restaurant4) applicationContext.getBean("AutowireProperties");

        System.out.println("using autowire properties method");

        res1.getHotDrink().prepareHotDrink();

        System.out.println("....................................");

        Restaurant2 res2 = (Restaurant2) applicationContext.getBean("AutowireConstructor");

        System.out.println("using autowire constructor method");
        res2.getHotDrink().prepareHotDrink();
    }
}
