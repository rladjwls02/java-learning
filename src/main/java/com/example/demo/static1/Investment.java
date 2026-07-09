package com.example.demo.static1;

//투자 클래스
public class Investment {
    private static final int BUDGET = 1000; //클래스에 귀속
// public class Stock
    public static class Stock{

        public double estimated() {
            return BUDGET * 1.4;
        }
    }
}
