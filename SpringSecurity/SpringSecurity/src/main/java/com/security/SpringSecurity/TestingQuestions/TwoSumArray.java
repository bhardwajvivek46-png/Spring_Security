package com.security.SpringSecurity.TestingQuestions;


import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.HashMap;

//check the sum of two elements are equal to the target
public class TwoSumArray {

    public static void main(String[] args) {

        int[] arr = {2,5,7,3,8};
        int target = 9;

        //bruteforce approach O(n^2)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Pair ["+arr[i]+", "+arr[j]+"] = "+target);
                }
            }
        }

        //optimized approach O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int res = target-arr[i];

            if(map.containsKey(res)){
                System.out.println("Pair is : "+res+" + "+arr[i]+" = "+target);
                return;
            }
            map.put(arr[i], i);
        }

    }

}
