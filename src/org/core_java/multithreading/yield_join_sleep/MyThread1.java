package org.core_java.multithreading.yield_join_sleep;

public class MyThread1 implements Runnable {
    Thread thread;
    MyThread1(Thread thread)
    {
        this.thread=thread;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("My Thread1 ::" + i);
            try {
                this.thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //      Thread.yield();

        }
    }
}
