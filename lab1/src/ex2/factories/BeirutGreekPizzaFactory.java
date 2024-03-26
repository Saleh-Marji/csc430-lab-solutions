package ex2.factories;

import ex2.models.GreekPizza;
import ex2.models.Pizza;

public class BeirutGreekPizzaFactory implements BeirutPizzaFactory{
    @Override
    public Pizza buildPizza() {
        GreekPizza greekPizza = new GreekPizza();
        greekPizza.setName("Greek");
        return greekPizza;
    }
}
