package ex6.visitor;

import ex6.item.Item;

public interface ItemVisitor {
    void visit(Item item);
}
