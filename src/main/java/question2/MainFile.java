package question2;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainFile {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Restaurant restaurant = applicationContext.getBean("teaRestaurant",Restaurant.class);



        System.out.println("output of question3....(injecting tea object as dependency using setter method)");
        restaurant.getHotDrink().prepareHotDrink();

        System.out.println(".......................................");

        Restaurant restaurant1= applicationContext.getBean("Restaurant",Restaurant.class);

        System.out.println("output of question4...(inner bean)");

        restaurant1.getHotDrink().prepareHotDrink();

        System.out.println(".......................................");

        System.out.println("output of question7 .....scope of bean is set as prototype");

        restaurant.getHotDrink().prepareHotDrink();


        Restaurant restaurant2 = applicationContext.getBean("teaRest",Restaurant.class);

        System.out.println("output of question7 .....scope of bean is set as singleton");

        restaurant2.getHotDrink().prepareHotDrink();


    }
}
