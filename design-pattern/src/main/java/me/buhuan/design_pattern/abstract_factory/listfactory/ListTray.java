package me.buhuan.design_pattern.abstract_factory.listfactory;

import me.buhuan.design_pattern.abstract_factory.factory.Item;
import me.buhuan.design_pattern.abstract_factory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray{

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>");
        buffer.append(caption + "</li>");
        buffer.append("<ul>");
        Iterator<Item> itemIterator = tray.iterator();
        while (itemIterator.hasNext()) {
            Item item = (Item) itemIterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>");
        buffer.append("</li>");
        return buffer.toString();
    }
}
