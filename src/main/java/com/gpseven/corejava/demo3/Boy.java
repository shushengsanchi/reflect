package com.gpseven.corejava.demo3;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Boy extends Person {

    //身高
    public int height;

    private int weight;

    public static String desc;

    public Boy() {}

    private Boy(int height) {
        this.height = height;
    }

    public Boy(int height,int weight) {
        this.height = height;
        this.weight = weight;
    }

    public static void playBasketball(){
        System.out.println("play basketball !");
    }

    public void playball(String ballType){
        System.out.println("play "+ballType+" !");
    }


    //追女孩
    private void pickUpGirl(){
        System.out.println("pick up girl !");
    }

    public int getWeight() {
        return weight;
    }
}
