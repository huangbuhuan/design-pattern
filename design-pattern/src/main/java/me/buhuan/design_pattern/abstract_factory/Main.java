package me.buhuan.design_pattern.abstract_factory;

import me.buhuan.design_pattern.abstract_factory.factory.Factory;
import me.buhuan.design_pattern.abstract_factory.factory.Link;
import me.buhuan.design_pattern.abstract_factory.factory.Page;
import me.buhuan.design_pattern.abstract_factory.factory.Tray;

public class Main {

    private static Tray trayNews;
    private Factory factory;

    public static void main(String[] args) {
        argsLengthNotEqaulOne(args);
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "www.people.com");
        Link gmw = factory.createLink("光明日报", "www.gmw.com");

        trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Page page = factory.createPage("LinkPage", "hbh");
        page.add(trayNews);
        page.output();
    }

    private static void argsLengthNotEqaulOne(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: Java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1 : Java Main listfactory.ListFactory");
            System.out.println("Example 2 : Java main tablefactory.TableFactory");
            System.exit(0);
        }
    }
}
