package me.buhuan.design_pattern.builder;

/**
 * 建造者
 * @author hbh
 *
 */
public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String arg);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
