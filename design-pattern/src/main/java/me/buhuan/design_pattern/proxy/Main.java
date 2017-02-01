package me.buhuan.design_pattern.proxy;

/**
 * Created by hbh on 2017/1/26.
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("名字是：" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("名字是：" + p.getPrinterName());
        p.print("Hello");
    }
}
