package me.buhuan.design_pattern.bridge;

/**
 * Created by hbh on 2017/2/1.
 */
public class StringDisplayImpl extends DisplayImpl{

    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.print("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.println("-");
        }
        System.out.print("+");
    }
}
