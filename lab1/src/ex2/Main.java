package ex2;

import ex2.factories.BeirutMeatPizzaFactory;
import ex2.stores.BeirutPizzaStore;
import ex2.stores.PizzaStore;

public class Main {

    public static void main(String[] args) {
        orderPizza();
    }

    private static void orderPizza() {
        BeirutPizzaStore pizzaStore = new BeirutPizzaStore();
        pizzaStore.setPizzaFactory(new BeirutMeatPizzaFactory());
        pizzaStore.orderPizza();
    }
}
