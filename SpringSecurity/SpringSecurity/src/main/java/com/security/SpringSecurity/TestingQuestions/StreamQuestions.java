package com.security.SpringSecurity.TestingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamQuestions {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,30,5,25,50,15);

        //filter number greater than 20
        List<Integer> greaterThanTwenty = list.stream().filter(x -> x>20).toList();
        System.out.println("Greater than twenty : "+greaterThanTwenty);

        //modify stream by adding 5 in all elements
        List<Integer> modifiedStream = list.stream().map(x -> x+5).toList();
        System.out.println("Modified stream : "+modifiedStream);

        //find element less than 20 and add 10 in it
        List<Integer> updateStream = list.stream().filter(x-> x<20).map(j-> j+10).toList();
        System.out.println("Updated stream : "+updateStream);

        //find the count and sum of the elements
        long count = list.stream().count();
        long sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Count : "+count);
        System.out.println("Sum : "+sum);



        //sort the list of stream
        List<Integer> sortedStream = list.stream().sorted().toList();
        System.out.println("Normal sorting : "+sortedStream);

        //sort the list in descending order
        List<Integer> descendingSorting = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending sorting : "+descendingSorting);

        List<String> str = Arrays.asList("AA", "AAA", "BBB", "A", "BB","BBBBB");

        //sort according to string length
        List<String> strLength = str.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println("String length comparison : "+strLength);


    }
}
