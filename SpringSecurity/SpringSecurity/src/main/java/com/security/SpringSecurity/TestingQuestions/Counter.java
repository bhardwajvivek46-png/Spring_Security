package com.security.SpringSecurity.TestingQuestions;

public class Counter {

    int count = 0;

    public synchronized void increment(){
        count++;
    }
}
