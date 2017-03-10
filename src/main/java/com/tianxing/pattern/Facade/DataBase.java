package com.tianxing.pattern.Facade;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created by tianxing on 2017/3/9.
 *
 */
public class DataBase {
    private DataBase(){}


    //获取数据库数据
    public static String getUserName(){
        return "user1";
    }

}
