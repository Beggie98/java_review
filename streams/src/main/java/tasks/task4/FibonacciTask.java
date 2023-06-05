package tasks.task4;

import java.util.Arrays;
import java.util.stream.Stream;

public class FibonacciTask {

    public static void main(String[] args) {

        //How does it work? iterate needs a lambda to specify the successor element
        //In the case of the tuple (3,5) the successor (5,3+5) = (5,8)
        //The next one (8,5+8) = (8, 13)

        Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0] + t[1]})
                .limit(8)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        System.out.println("**************");
        //Print the Fibonacci series in normal way. (Following of previous task)
        Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0] + t[1]})
                .limit(8)
                .map(t -> t[0])
                .forEach(System.out::println);



    }

}
/*
The Fibonacci series is famous as a classic programming exercise. The
numbers in the following sequence are part of the Fibonacci series. 0, 1, 1, 2, 3, 5,
8, 13, 21, 34, 55.... The first two numbers of the series are 0 and 1, and each
subsequent number is the sum of the previous two.
• The series of Fibonacci tuples is similar; you have sequence of a number and
its successor in the series : (0,1),(1,1),(1,2),(2,3),(3,5)...
• You task is to generate the first 20 elements of the series of Fibonacci tuples
using iterate method.

Print the Fibonacci series in normal way. (Following of previous task)
 */