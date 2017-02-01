package me.buhuan.design_pattern.abstract_factory.listfactory;

import me.buhuan.design_pattern.abstract_factory.factory.Item;
import me.buhuan.design_pattern.abstract_factory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page{

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>");
        buffer.append("<body>");
        buffer.append("<h1>" + title + "</h1>");
        buffer.append("<ul>");
        Iterator<Item> it = items.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>");
        buffer.append("</body>");
        buffer.append("</html>");
        return buffer.toString();
    }
}
