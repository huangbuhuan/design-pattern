package me.buhuan.design_pattern.bridge;

/**
 * Created by hbh on 2017/2/1.
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int items) {
        open();
        for (int i = 0; i < items; i++) {
            print();
        }
        close();
    }
}
