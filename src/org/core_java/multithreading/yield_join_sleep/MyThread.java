package org.core_java.multithreading.yield_join_sleep;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("My Thread ::" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //       Thread.yield();
        }
    }
}
