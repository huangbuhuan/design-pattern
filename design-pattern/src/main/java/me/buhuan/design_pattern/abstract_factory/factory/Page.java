package me.buhuan.design_pattern.abstract_factory.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
	protected String title;
	protected String author;
	protected List<Item> items = new ArrayList<>();
	
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void output() {
		try {
			String filename = title + ".html";
			Writer writer = new FileWriter(filename);
			writer.write(makeHTML());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public abstract String makeHTML();
}
