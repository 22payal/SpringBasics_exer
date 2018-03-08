package question2;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant4 {
    @Autowired
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }


    @Override
    public String toString() {
        return "Restaurant4{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
