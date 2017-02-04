package me.buhuan.design_pattern.decorator;

/**
 * Created by hbh on 2017/2/4.
 */
public abstract  class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
