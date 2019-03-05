package edu.java.practise.inner_classes;

public class InterfaceInnerClass {
    interface InnerInterFace{
        public void m1();
    }
    class Inner implements InnerInterFace{
        public void m1(){
            System.out.println("Hello");
        }
    }


    public static void main(String[] args) {
        InterfaceInnerClass.Inner innerInterFace=new InterfaceInnerClass().new Inner();
        innerInterFace.m1();
    }
}
