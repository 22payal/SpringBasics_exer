package question2;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink{

    @Override
    public void prepareHotDrink() {
        System.out.println("preparing tea...");
    }
}
