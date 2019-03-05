package edu.java.practise.multithreading;


public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyRunnableThread ..run() method");
    }
}
