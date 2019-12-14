package com.gpseven.corejava.demo3;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Person extends Object{

    //名字
    public String name;

    //年龄
    private int  age;

    //说话
    public void talk(){
        System.out.println(name +",正在说话");
    }

}
