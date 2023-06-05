package tasks.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));

        numbers.stream()
                .map(n -> n*n)
                .forEach(System.out::println);


    }

}
/*
Given a list of numbers how would you return a list of the square of each
number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
 */