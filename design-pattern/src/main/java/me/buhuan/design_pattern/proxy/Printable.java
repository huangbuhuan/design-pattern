package me.buhuan.design_pattern.proxy;

/**
 * Created by hbh on 2017/1/26.
 */
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
