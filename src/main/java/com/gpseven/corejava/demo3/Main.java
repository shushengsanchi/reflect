package com.gpseven.corejava.demo3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Main {


    public static void main(String[] args) throws Exception {
//        filedOper();
//        methodOper();
        constructorOper();
    }



    /**
     * 类的基本操作
     */
    public static void basicOper(){
        /**
         * 获取一个Class的对象实例
         */
        Class clazz = Boy.class;
//        Class clazz2= new Boy().getClass();
//              try {
//            Class clazz3= Class.forName("com.gpseven.corejava.demo3.Boy");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            Class clazz4 = Main.class.getClassLoader().loadClass("com.gpseven.corejava.demo3.Boy");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        int modifers = clazz.getModifiers();
        System.out.println("modifers:"+modifers);

        Package boyPkg = clazz.getPackage();
        System.out.println("boyPkg:"+boyPkg);

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        System.out.println(clazz.getClassLoader());

        System.out.println(clazz.getInterfaces().length);

        System.out.println(clazz.getSuperclass());

        System.out.println(clazz.getAnnotations().length);
    }

    public  static  void filedOper() throws Exception {
        Class clazz = Boy.class;

        Boy boy = (Boy)clazz.newInstance();
        Field [] fields = clazz.getFields(); //获取当前类当中所有的公有字段,包含继承

        for (int i = 0; i <fields.length ; i++) {
            System.out.println(fields[i]);
        }

        Field nameField = clazz.getField("name");
        System.out.println(nameField.getName());

        Field [] fields2 = clazz.getDeclaredFields();
        System.out.println(fields2.length);

        for (int i = 0; i <fields2.length ; i++) {
            System.out.println(fields2[i]);
        }

        Field weightField = clazz.getDeclaredField("weight");

        System.out.println(weightField.getModifiers());



        //让私有字段进行强制访问
        weightField.setAccessible(true);

        weightField.set(boy,180);

        System.out.println(boy.getWeight());

        Field descField = clazz.getField("desc");

        descField.set(null,"这是一个静态的属性内容!!");

        System.out.println(Boy.desc);

    }

    public static void methodOper() throws Exception {
        Class clazz = Boy.class;
        Boy boy = (Boy)clazz.newInstance();
        Method[] methods =  clazz.getMethods();
        System.out.println("public method 一共有"+methods.length+"个");

        for (int i = 0; i <methods.length ; i++) {
            System.out.println(methods[i]);
        }

        Method talkMethod = clazz.getMethod("talk");
        System.out.println(talkMethod.getName());
        Method playBallMethod = clazz.getMethod("playball",String.class);
        System.out.println( playBallMethod.getName());
        System.out.println( playBallMethod.getModifiers());
        playBallMethod.invoke(boy,"乒乓球");

        Method[] methods2=  clazz.getDeclaredMethods();
        System.out.println(methods2.length);
        Method pickUpGirlMethod = clazz.getDeclaredMethod("pickUpGirl");
        System.out.println(pickUpGirlMethod.getModifiers());
        pickUpGirlMethod.setAccessible(true);
        pickUpGirlMethod.invoke(boy);

        Method playBasketballMethod = clazz.getDeclaredMethod("playBasketball");

        playBasketballMethod.invoke(null);
    }


    public  static void constructorOper() throws Exception {
        Class clazz = Boy.class;
        clazz.newInstance(); // ---> constructor 进行对象的构建.


        System.out.println(clazz.getConstructors().length);
        System.out.println(clazz.getDeclaredConstructors().length);

        //获取clazz中无参的构造器
        Constructor constructor= clazz.getDeclaredConstructor();

        Constructor constructor1= clazz.getDeclaredConstructor(int.class);

        Constructor constructor2= clazz.getDeclaredConstructor(int.class,int.class);


        System.out.println(constructor.getModifiers());
        System.out.println(constructor1.getModifiers());
        System.out.println(constructor2.getModifiers());

        Boy  boy = (Boy)constructor.newInstance();
        System.out.println(boy);

        boy = (Boy)constructor2.newInstance(176,130);
        System.out.println(boy.getWeight());

        constructor1.setAccessible(true);
        boy = (Boy)constructor1.newInstance(176);
        System.out.println(boy.height);

    }
}
