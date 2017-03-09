package com.tianxing.pattern.composite;

/**
 * Created by tianxing on 2017/3/9.
 */
public class FileTreatMentException extends RuntimeException {
    public FileTreatMentException(){

    }

    public FileTreatMentException(String msg){
        super(msg);
    }
}
