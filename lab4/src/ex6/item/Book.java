package ex6.item;

public class Book extends Item {
    private double cost;
    private String isbn;

    public Book(double cost, String isbn) {
        this.cost = cost;
        this.isbn = isbn;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public double getPrice() {
        return cost * 1.2;
    }
}
