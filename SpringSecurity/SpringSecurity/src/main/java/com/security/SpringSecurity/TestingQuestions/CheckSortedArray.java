package com.security.SpringSecurity.TestingQuestions;

//check weather the array is sorted or not
public class CheckSortedArray {

    public static boolean isSortedArray(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,8,5};

        boolean isSorted = isSortedArray(arr);
        if(isSorted){
            System.out.println("Array is sorted...");
        } else{
            System.out.println("Array is not sorted...");
        }
    }
}
