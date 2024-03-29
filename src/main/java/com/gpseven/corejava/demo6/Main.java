package com.gpseven.corejava.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-ioc.xml");

        A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");
        C c = (C) context.getBean("c");

    }
}
