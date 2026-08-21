package com.security.SpringSecurity.TestingQuestions;

public class Main {

    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();

        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();
    }
}
