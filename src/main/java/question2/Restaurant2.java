package question2;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant2 {
    HotDrink hotDrink;

    @Autowired
    Restaurant2( HotDrink hd)
    {
        hotDrink= hd;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant2{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
