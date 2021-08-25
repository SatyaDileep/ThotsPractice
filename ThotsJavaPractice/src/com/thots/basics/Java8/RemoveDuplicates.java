package com.thots.basics.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("hey there..!");

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 7, 7, 8, 9);

        List<Integer> uniqueList = new ArrayList<>();

        /**
         * Imperative way
         */
        for (Integer integer : listOfIntegers) {
            if (!uniqueList.contains(integer))
                uniqueList.add(integer);
        }
        System.out.println(uniqueList);

        /**
         * Declarative style java8
         */
        List<Integer> targetList = listOfIntegers.stream().distinct().collect(Collectors.toList());
        System.out.println(targetList);
    }

}
