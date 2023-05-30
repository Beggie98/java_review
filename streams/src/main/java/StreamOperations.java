import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,3,9,2,2,6,3);
        myList.forEach(x -> System.out.println(x));
        myList.forEach(System.out::println);//cleaner code
        //forEach() method accepts Consumer functional interface
        //forEach() belongs to Iterable interface

        //FILTER
        myList.stream()
                .filter(i -> i%3 == 0)
                .distinct()
                .forEach(System.out::println);
        //forEach() here belongs to Stream interface and it is one of the terminal operations
        //After we implement intermediate operations, we need to terminate the flow (exit the stream pipeline).
        //In order to do that we use terminal operators



        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2==0)
                .skip(2)
                .forEach(System.out::println);


        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3==0)
                .forEach(System.out::println);

    }

}
