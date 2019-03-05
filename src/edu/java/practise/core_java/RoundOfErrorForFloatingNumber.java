package edu.java.practise.core_java;

import java.math.BigDecimal;

public class RoundOfErrorForFloatingNumber {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;

        System.out.println("x = " + x);
        System.out.println("y = " + y );
        System.out.println(x == y);

        BigDecimal decimal=new BigDecimal(0.7);
        System.out.println(decimal);
        decimal.add(new BigDecimal(0.1));
        System.out.println(decimal.abs());

    }
}
