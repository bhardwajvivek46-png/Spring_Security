package com.security.SpringSecurity.TestingQuestions;

import java.util.Arrays;

public class InterviewPrograms {

    public static void main(String[] args) {
        //Move zeros to the end
        int[] arr = {6,0,8,9,0,2,0,5,1};
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[idx++] = arr[i];
            }
        }
        while(idx < arr.length){
            arr[idx++] = 0;
        }
        System.out.print(Arrays.toString(arr));
    }
}
