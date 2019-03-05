package edu.java.practise.multithreading;

public class MultiThreadingEx {
    public static void main(String[] args) {
        MyRunnableThread myRunnableThread=new MyRunnableThread();
        MyThread thread=new MyThread();
        thread.start();
        Thread thread1=new Thread(myRunnableThread);
        thread1.setPriority(1);
        thread1.start();
        for(int i=0;i<10;i++)
            System.out.println("Main Thread"+i);
    }
}
