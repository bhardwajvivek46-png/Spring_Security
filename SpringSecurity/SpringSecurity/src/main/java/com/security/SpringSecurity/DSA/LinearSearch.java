package com.security.SpringSecurity.DSA;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {5,23,12,9,30};
        int target = 10;

        for(int i : arr){
            if(i==target){
                System.out.println("Element found at index : "+i);
                return;
            }
        }
        System.out.println("No element found.");
    }
}
