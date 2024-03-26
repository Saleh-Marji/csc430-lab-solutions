package ex1.directors;

import ex1.models.Meal;
import ex1.builders.MealBuilder;

import java.util.NoSuchElementException;

public class EmployeeDirector {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal buildMealWithMainDish(String mainDish) {
        checkNull();
        mealBuilder.createNewMeal();
        mealBuilder.buildMainDish(mainDish);
        mealBuilder.buildDrinks();
        mealBuilder.buildSweets();
        return mealBuilder.getMeal();
    }

    public Meal getMeal() {
        checkNull();
        return mealBuilder.getMeal();
    }

    private void checkNull() {
        if(mealBuilder == null) {
            throw new NoSuchElementException("Please set the builder first!");
        }
    }
}
