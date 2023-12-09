package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(19,20,3,4,12,13,45,68,78);

        Predicate<Integer> graterNubmer = num -> num > 30;

        List<Integer> listResult = number.stream().filter(graterNubmer).collect(Collectors.toList());

        listResult.stream().forEach(System.out::println);
        

        
    }
}