package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -1, 2, -2, 0, -3, 3);
        List<Integer> positive = numbers.stream().filter(num -> num > 0).toList();
        positive.forEach(System.out::println);
    }
}
