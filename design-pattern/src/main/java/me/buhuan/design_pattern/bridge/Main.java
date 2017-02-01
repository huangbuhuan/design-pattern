package me.buhuan.design_pattern.bridge;

/**
 * Created by hbh on 2017/2/1.
 */
public class Main {

    public static void main(String[] args) {
        Display world = new Display(new StringDisplayImpl("world"));
        Display china = new Display(new StringDisplayImpl("china"));
        CountDisplay usa = new CountDisplay(new StringDisplayImpl("usa"));
        world.display();
        china.display();
        usa.display();
        usa.multiDisplay(5);
    }
}
