package ex6.item;

import ex6.visitor.ItemVisitable;
import ex6.visitor.ItemVisitor;

public abstract class Item implements ItemVisitable {
    public abstract double getPrice();

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visit(this);
    }
}
