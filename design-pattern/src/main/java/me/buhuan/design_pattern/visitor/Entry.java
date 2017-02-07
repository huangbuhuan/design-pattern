package me.buhuan.design_pattern.visitor;

import me.buhuan.design_pattern.composite.FileTreatementException;

import java.util.Iterator;

/**
 * Created by hbh on 2017/2/5.
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();

    public Entry add() throws FileTreatementException{
        throw new FileTreatementException();
    }

    public Iterator iterator() throws FileTreatementException {
        throw new FileTreatementException();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
