package ex6.cart;

import ex6.item.Item;
import ex6.visitor.ItemVisitable;
import ex6.visitor.ItemVisitor;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ItemVisitable {
    List<Item> items = new ArrayList<>();

    void add(Item item) {
        items.add(item);
    }

    void remove(Item item) {
        items.remove(item);
    }

    void updateItem(Item item) {
        remove(item);
        add(item);
    }

    @Override
    public void accept(ItemVisitor visitor) {
        for (Item item : items) {
            visitor.visit(item);
        }
    }
}
