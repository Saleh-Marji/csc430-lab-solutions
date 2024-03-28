package ex2;

import ex2.html.Html;
import ex2.html.tags.CompositeTag;
import ex2.html.tags.LeafTag;

public class Main {
    public static void main(String[] args) {
        Html html = new Html();
        html.setHead(new CompositeTag("head")
                .child(new LeafTag("title"))
        );
        html.setBody(new CompositeTag("body")
                .child(new CompositeTag("div")
                        .child(new LeafTag("p"))
                ).child(new LeafTag("text"))
        );
        System.out.println(html);
    }
}
