package ex2.html;

import ex2.html.tags.HtmlTag;

public class Html {
    private HtmlTag head;
    private HtmlTag body;

    public HtmlTag getHead() {
        return head;
    }

    public void setHead(HtmlTag head) {
        this.head = head;
    }

    public HtmlTag getBody() {
        return body;
    }

    public void setBody(HtmlTag body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return """
<html>
%s
%s
</html>""".formatted(head, body);
    }
}
