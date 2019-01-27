package org.core_java.control_flow;

public class Test {
    public static void main(String[] args) {
        int i = 10;
        switch (++i) {
            case 5:
                System.out.println(5);
                break;
            case 10 + 14:
                System.out.println(10);
                break;
            default:
                System.out.println("hello");
        }
        // for (; ; ) ;
        // System.out.println("Hello");
    }
}
