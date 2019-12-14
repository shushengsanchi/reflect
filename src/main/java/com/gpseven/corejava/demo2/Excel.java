package com.gpseven.corejava.demo2;

/**
 * Every oak must be an acorn ...
 * Author : Seven
 */
public class Excel implements Office {

    @Override
    public void toPDF() {
        System.out.println("Excel 2 PDF");
    }
}
