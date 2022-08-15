package com.test;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = List.of("John", "Sunday", "Monday", "Apple", "Amul taste of india");
        Predicate<String> predicate = str -> { return str.length() >= 5; };
        words.stream().filter(predicate).forEach(System.out::println);
    }
}


