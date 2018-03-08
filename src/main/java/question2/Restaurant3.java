package question2;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant3 {

    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }
   @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }



    @Override
    public String toString() {
        return "Restaurant3{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
