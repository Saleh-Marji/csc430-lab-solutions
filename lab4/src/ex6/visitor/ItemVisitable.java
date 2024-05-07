package ex6.visitor;

public interface ItemVisitable {
    void accept(ItemVisitor visitor);
}
