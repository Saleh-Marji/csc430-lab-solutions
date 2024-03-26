package ex1.models;

public class Meal {
    private String mainDish, drinks, sweets;

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getSweets() {
        return sweets;
    }

    public void setSweets(String sweets) {
        this.sweets = sweets;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mainDish='" + mainDish + '\'' +
                ", drinks='" + drinks + '\'' +
                ", sweets='" + sweets + '\'' +
                '}';
    }
}
