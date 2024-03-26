package ex1.builders;

public class ChildMealBuilder extends MealBuilder {
    @Override
    public void buildMainDish(String mainDish) {
        checkNull();
        getMeal().setMainDish(mainDish);
    }

    @Override
    public void buildDrinks() {
        checkNull();
        getMeal().setDrinks("Orange Juice");
    }

    @Override
    public void buildSweets() {
        checkNull();
        getMeal().setSweets("Donuts");
    }
}
