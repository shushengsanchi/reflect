package com.gpseven.corejava.demo2;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Word implements Office {
    @Override
    public void toPDF() {
        System.out.println("Word 2 PDF");
    }
}
