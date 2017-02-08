package me.buhuan.design_pattern.facade;

/**
 * Created by hbh on 2017/2/8.
 */
public class Facade {
    public void test() {
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}
