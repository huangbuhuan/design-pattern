package me.buhuan.design_pattern.composite;

/**
 * Created by hbh on 2017/2/3.
 */
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + " )";
    }
}
