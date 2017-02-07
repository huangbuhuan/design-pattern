package me.buhuan.design_pattern.visitor;

/**
 * Created by hbh on 2017/2/5.
 */
public abstract  class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
