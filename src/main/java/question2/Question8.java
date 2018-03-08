package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question8 {

    public static void main(String[] args) {

        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("question8Config.xml");

        Restaurant3 res = (Restaurant3) applicationContext.getBean("Restaurant");

        System.out.println("using required anotation for HotDrink setter mtd..");
        res.getHotDrink().prepareHotDrink();
    }
}
