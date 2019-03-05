package edu.java.practise.operators_assignments;

public class Test {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);

        int y=x++;

        System.out.println(y);
        System.out.println(x);
        y=x+1;
        System.out.println(y);
    }
}
