package me.buhuan.design_pattern.flyweight;

/**
 * Created by hbh on 2017/2/13.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage:  Java Main digits");
            System.out.println("Example: Java Main 12121");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
