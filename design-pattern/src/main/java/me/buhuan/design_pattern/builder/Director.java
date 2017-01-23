package me.buhuan.design_pattern.builder;

/**
 * 监工
 * @author hbh
 *
 */
public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeString("Greeting");
		builder.makeString("早上");
		builder.makeItems(new String[]{
				"早上好",
				"下午好"
		});
		builder.makeString("晚上");
		builder.makeItems(new String[]{
				"晚上好",
				"晚安"
		});
		builder.close();
	}
}
