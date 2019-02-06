package org.core_java.multithreading.yield_join_sleep;

public class TestThread {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        Thread thread = new Thread(new MyThread());
        thread.setPriority(10);
        thread.setName("thread");
        Thread thread1 = new Thread(new MyThread1(thread));
        thread1.setName("thread1");
        thread1.setPriority(1);

        thread.start();

        thread1.start();
        try {
            thread1.join(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
   //         Thread.yield();
            System.out.println("Main  ::" + i);
        }
    }
}
