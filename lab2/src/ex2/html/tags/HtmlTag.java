package ex2.html.tags;

import java.util.List;

public abstract class HtmlTag {
    private String id;
    private String name;
    private String cssClasses;
    private String content;

    public HtmlTag(String name) {
        this.name = name;
    }

    public HtmlTag() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCssClasses() {
        return cssClasses;
    }

    public void setCssClasses(String cssClasses) {
        this.cssClasses = cssClasses;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "<%s>%s</%s>".formatted(name, content == null ? "" : content, name);
    }
}
