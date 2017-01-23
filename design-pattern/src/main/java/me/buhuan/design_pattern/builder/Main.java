package me.buhuan.design_pattern.builder;

public class Main {
	public void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			System.out.println(textBuilder.getResult());
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			System.err.println(htmlBuilder.getResult());
		} else {
			usage();
			System.exit(0);
		}
	}
	
	public static void usage() {
		System.out.println("Usage: 编写纯文本" );
		System.out.println("Usage: 编写HTML文档");
	}
}
