package com.fb.java.RunableTest;

public class ThreadB implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}