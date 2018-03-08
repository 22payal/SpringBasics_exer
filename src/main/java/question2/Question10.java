package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question10 {

    public static void main(String[] args) {

        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("question10Config.xml");

        Restaurant res = (Restaurant) applicationContext.getBean(Restaurant.class);

        res.getHotDrink().prepareHotDrink();
    }
}
