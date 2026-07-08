package com.example.demo.static1;

public class TaxCalculator {
    private static final double TAX_RATE = 0.11;

    // private double originalPrice;
    // private double taxedPrice
    public static double calclulate(double originalPrice) {

        return TAX_RATE * originalPrice;
    }
}
