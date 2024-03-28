package ex2.html.tags;

import ex2.html.Html;

import java.util.ArrayList;
import java.util.List;

public class CompositeTag extends HtmlTag {
    private List<HtmlTag> children = new ArrayList<>();

    public CompositeTag(String name) {
        super(name);
    }

    public CompositeTag child(HtmlTag tag) {
        children.add(tag);
        return this;
    }

    public List<HtmlTag> getChildren() {
        return children;
    }

    public void setChildren(List<HtmlTag> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder childrenBuilder = new StringBuilder();
        for(HtmlTag tag : children) {
            childrenBuilder.append(tag.toString()).append("\n");
        }
        return """
<%s>
%s
%s
</%s>
                """.formatted(getName(), getContent() == null ? "" : getContent(), childrenBuilder.toString(), getName());
    }
}
