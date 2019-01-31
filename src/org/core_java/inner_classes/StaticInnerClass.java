package org.core_java.inner_classes;

public class StaticInnerClass {
    static class InnerClass{
        public void m1(){
            System.out.println("Hello");
        }

        public static void main(String[] args) {
            StaticInnerClass.InnerClass innerClass=new StaticInnerClass.InnerClass();
            innerClass.m1();
        }
    }
}
