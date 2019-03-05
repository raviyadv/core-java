package edu.java.practise.inner_classes;

public class NormalInnerClass {
    class InnerClass{
        int i=10;
// can not declare static declaration here because until we can not create object of NormalInnerClass we can not use InnerClass
    }

    public static void main(String[] args) {
  ///      InnerClass innerClass=new InnerClass();
        NormalInnerClass.InnerClass innerClass=new NormalInnerClass().new InnerClass();
        System.out.println(innerClass.i);

    }
}
