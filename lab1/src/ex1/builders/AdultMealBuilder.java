package ex1.builders;

public class AdultMealBuilder extends MealBuilder {
    @Override
    public void buildMainDish(String mainDish) {
        checkNull();
        getMeal().setMainDish(mainDish);
    }

    @Override
    public void buildDrinks() {
        checkNull();
        getMeal().setDrinks("Pepsi");

    }

    @Override
    public void buildSweets() {
        checkNull();
        getMeal().setSweets("Cake");
    }
}
