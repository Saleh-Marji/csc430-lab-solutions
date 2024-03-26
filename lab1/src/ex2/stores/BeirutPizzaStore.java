package ex2.stores;

import ex2.factories.BeirutPizzaFactory;
import ex2.models.Pizza;

import java.util.Objects;

public class BeirutPizzaStore extends PizzaStore {
    private BeirutPizzaFactory pizzaFactory;

    public void setPizzaFactory(BeirutPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza() {
        Objects.requireNonNull(pizzaFactory);
        return pizzaFactory.buildPizza();
    }
}
