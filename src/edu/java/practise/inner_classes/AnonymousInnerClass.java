package edu.java.practise.inner_classes;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){

            }
        };

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
    }
}
