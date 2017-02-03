package me.buhuan.design_pattern.composite;


/**
 * Created by hbh on 2017/2/3.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Making root");
        Entry rootDir = new Directory("root");
        Entry binDir = new Directory("bin");
        Entry tmpDir = new Directory("tmpDir");

        try {
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            binDir.add(new File("vi.sh", 1000));
            binDir.add(new File("ls.sh", 1000));

        } catch (FileTreatementException e) {
            e.printStackTrace();
        }

        rootDir.printList();

    }

}
