package com.security.SpringSecurity.DSA;

//WAP to print the first 20 Fibonacci number
public class FibonacciNumber {

    static int count = 2;
    public static void fibonacci(int first, int second){
        if(count<20){
            int nextNum = first + second;
            System.out.println(nextNum);
            count++;
            fibonacci(second, nextNum);
        } else{
            return;
        }
    }

    public static int F(int num){
        if(num <= 1){
           return num;
        }else {
            return F(num-1)+F(num-2);
        }
    }

    public static void main(String[] args) {

        //1. using for loop
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<=18;i++){
            int nextNum = first + second;
            System.out.println(nextNum);
            first = second;
            second = nextNum;
        }
        System.out.println("------------------------------------------------------------------");

        //2. using recursion
        System.out.println(0);
        System.out.println(1);
        fibonacci(0,1);

        System.out.println("-------------------------------------------------------------------");
        //3. using mathematical expression F(n) = F(n-1) + F(n-2);
        System.out.println(F(20));

    }
}
