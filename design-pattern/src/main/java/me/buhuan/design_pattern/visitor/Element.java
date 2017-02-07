package me.buhuan.design_pattern.visitor;

/**
 * Created by hbh on 2017/2/5.
 */
public interface Element {
    void accept(Visitor visitor);
}
