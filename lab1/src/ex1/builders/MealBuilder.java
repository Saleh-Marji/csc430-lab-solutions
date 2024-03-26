package ex1.builders;

import ex1.models.Meal;

public abstract class MealBuilder {
    private Meal meal;

    public void createNewMeal() {
        meal = new Meal();
    }

    public Meal getMeal() {
        return meal;
    }

    public abstract void buildMainDish(String mainDish);

    public abstract void buildDrinks();

    public abstract void buildSweets();

    protected void checkNull() {
        if(getMeal() == null) {
            createNewMeal();
        }
    }
}
