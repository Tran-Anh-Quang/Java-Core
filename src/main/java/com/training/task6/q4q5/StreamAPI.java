package com.training.task6.q4q5;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void runQ4(){
        List<Integer> numbers = new Random().ints(10, -100, 101).boxed()
                .collect(Collectors.toList());

        System.out.println("Danh sách các số nguyên: " + numbers);

        int sum = numbers.stream()
                .filter(num -> num % 2 == 0 && num % 9 == 0)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Tổng các số chẵn chia hết cho 9 và không trùng lặp: " + sum);
    }

}
