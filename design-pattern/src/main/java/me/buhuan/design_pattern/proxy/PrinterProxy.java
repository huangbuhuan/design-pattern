package me.buhuan.design_pattern.proxy;

/**
 * Created by hbh on 2017/1/26.
 */
public class PrinterProxy implements Printable{
    private String name;
    private Printer real;

    public PrinterProxy() {

    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    public synchronized void setPrinterName(String name) {
        if (real != null)
            real.setPrinterName(name);
        this.name = name;
    }


    @Override
    public String getPrinterName() {
        return name;
    }

    public void print(String string) {
        realize();
        real.print(string);
    }

    public synchronized void realize() {
        if (real == null)
            real = new Printer(name);
    }
}
