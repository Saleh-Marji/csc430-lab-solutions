package ex1;

import ex1.builders.AdultMealBuilder;
import ex1.builders.ChildMealBuilder;
import ex1.directors.EmployeeDirector;

public class Main {

    private static final EmployeeDirector director = new EmployeeDirector();

    public static void main(String[] args) {
        orderPizzaForDad();
        orderBurgerForMom();
        orderNuggetsForChild();
    }

    private static void orderPizzaForDad() {
        director.setMealBuilder(new AdultMealBuilder());
        director.buildMealWithMainDish("Pizza");
    }

    private static void orderBurgerForMom() {
        director.setMealBuilder(new AdultMealBuilder());
        director.buildMealWithMainDish("Burger");
    }

    private static void orderNuggetsForChild() {
        director.setMealBuilder(new ChildMealBuilder());
        director.buildMealWithMainDish("Nuggets");
    }
}