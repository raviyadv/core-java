package edu.java.practise.inner_classes;

public class MethodInnerClass {
    public void m1(){
        /**
         * method inner method is use to logic again and again with in the method, we can not
         * use method inner class outside the method
         */
        class InnerClass{
            public void m2(){
                System.out.println("m1");
            }
        }
        InnerClass innerClass=new InnerClass();
        innerClass.m2();
    }

    public static void main(String[] args) {
        new MethodInnerClass().m1();
    }
}
