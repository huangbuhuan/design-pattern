package me.buhuan.design_pattern.visitor;

import me.buhuan.design_pattern.composite.FileTreatementException;

/**
 * Created by hbh on 2017/2/5.
 */
public class Main {

    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        rootDir.add(binDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("ls", 10000));
        rootDir.accept(new ListVisitor());
    }
}
