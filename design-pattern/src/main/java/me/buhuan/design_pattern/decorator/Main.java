package me.buhuan.design_pattern.decorator;

/**
 * Created by hbh on 2017/2/4.
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new StringDisplay("hello");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(new FullBorder(new StringDisplay("你好")), '#');
        d4.show();
    }
}
