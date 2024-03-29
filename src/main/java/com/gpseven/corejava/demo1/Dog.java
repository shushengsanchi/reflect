package com.gpseven.corejava.demo1;

import java.lang.reflect.Method;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Dog {

    public String color;

    public void bark(){
        System.out.println("Dog barking!");
    }

    public static void main(String[] args) throws Exception {

        Class clazz = Dog.class;

        //创建对象
        Dog dog = (Dog)clazz.newInstance();

        //获取类的结构
        System.out.println(clazz.getSuperclass() ); // 父类
        System.out.println(clazz.getClassLoader()); // 类的classlader
        System.out.println(clazz.getPackage());     // 包名
        System.out.println(clazz.getName());        // 类名
        //...

        Method method = clazz.getDeclaredMethod("bark");
        method.invoke(clazz.newInstance());  //  ---> Dog dog =new Dog(); dog.bark()

    }
}
