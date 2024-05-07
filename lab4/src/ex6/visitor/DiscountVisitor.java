package ex6.visitor;

import ex6.item.Book;
import ex6.item.Fruit;
import ex6.item.Item;

public class DiscountVisitor implements ItemVisitor {

    public void visit(Book book) {
        if(book.getCost() > 50) {
            book.setCost(book.getCost() - 5);
        }
    }

    public void visit(Fruit fruit) {
        if(fruit.getWeight() > 5) {
            fruit.setPrice(fruit.getPrice() - 3);
        }
    }

    @Override
    public void visit(Item item) {
        if(item instanceof Book book) {
            visit(book);
        }else if(item instanceof Fruit fruit) {
            visit(fruit);
        }
    }
}
