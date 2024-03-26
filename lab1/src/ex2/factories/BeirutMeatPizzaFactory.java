package ex2.factories;

import ex2.models.MeatPizza;
import ex2.models.Pizza;

public class BeirutMeatPizzaFactory implements BeirutPizzaFactory {
    @Override
    public Pizza buildPizza() {
        MeatPizza meatPizza = new MeatPizza();
        meatPizza.setName("Meat");
        return meatPizza;
    }
}
