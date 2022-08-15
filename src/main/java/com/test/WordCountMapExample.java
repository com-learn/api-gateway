package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountMapExample {
    public static void main(String[] args) {
        String statement = "Hello World My name is Jane and I hate Mango Fruit";
        Map<Integer, List<String>> map =
        Arrays.stream(statement.split(" "))
                .collect(Collectors.groupingBy(String::length));

        map.keySet().stream().
                sorted(Comparator.reverseOrder())
                .forEach(key->{
            System.out.println("key ::"+ key);
            System.out.println("value ::" + map.get(key));
        });

    }
}
