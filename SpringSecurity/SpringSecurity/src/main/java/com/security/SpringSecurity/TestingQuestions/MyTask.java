package com.security.SpringSecurity.TestingQuestions;

public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
