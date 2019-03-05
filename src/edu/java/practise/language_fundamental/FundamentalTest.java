package edu.java.practise.language_fundamental;

public class FundamentalTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array1 = {10, 20, 30};
        int[][] twoDimension = {{10, 20, 30}, {40, 50, 60}};
        for (int[] data : twoDimension) {
            for (int da : data)
                System.out.println(da);
        }
        m1(10);
        m1(20,30);
    }
        public static void m1(int... x) {
            System.out.println(x.length);
    }
}
