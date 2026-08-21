package com.security.SpringSecurity.DSA;

public class MinValueInArray {

    public static void main(String[] args) {
        int[] arr = {18,5,36,25,10,3};

        int minValue = arr[0];
        for(int a : arr){
            if(a<minValue){
                minValue = a;
            }
        }
        System.out.println("Minimum value in an array : "+minValue);
    }
}
