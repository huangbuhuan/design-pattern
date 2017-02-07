package me.buhuan.design_pattern.visitor;

import me.buhuan.design_pattern.composite.FileTreatementException;

/**
 * Created by hbh on 2017/2/5.
 */
public class FileTreatmentException extends Exception{
    public FileTreatmentException() {

    }
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
