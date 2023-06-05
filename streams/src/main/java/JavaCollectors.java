import java.util.*;
import java.util.stream.Collectors;


public class JavaCollectors {

    public static void main(String[] args) {
        //toCollection(Supplier) : is used to create a collection from a stream using collector
        System.out.println("********toCollection()**********");
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);


        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList(): returns a Collector interface that gathers the input data into a new list
        System.out.println("********toList()**********");

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        //toList(): returns a Collector interface that gathers the input data into a new set
        System.out.println("********toSet()**********");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());

        System.out.println(numberSet2);

        //toMap(Function, Function) : returns a Collector interface that gathers the input data into a new map
        System.out.println("********toMap()**********");
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);


        //counting() : returns a Collector that counts the number of the elements, returns long
        //count vs counting - .count() is more generalized, .count() skips intermediate operations
        System.out.println("********counting()**********");
        long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //summingInt(toIntFunction) : returns a Collector that produces the sum of an integer-valued function
        System.out.println("********summingInt()**********");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //averagingInt(toIntFunction) : returns the average of the integers passed values
        System.out.println("********averagingInt()**********");

        Double calorieAvg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAvg);

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("********joining()**********");
        List<String> courses = Arrays.asList("Java", "TS", "JS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);

        System.out.println("********partitioningBy()**********");
        //partitioningBy() : is used to partition a stream of objects(or a set of elements) based on a given predicate

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        System.out.println("********partitioningBy()**********");
        //groupingBy() : is used for grouping objects by some property and storing results in a map instance
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);


    }

}
