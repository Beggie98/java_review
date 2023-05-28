package appleTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate() );
//        System.out.println(heavyApple);
//
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate);
//        System.out.println(greenApple);

        List<Apple> heavyApple = filterApples(inventory, apple -> apple.getWeight() > 200 );
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple);

        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());

    }

    //the method must be applicable for both weight and color
//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//        List<Apple> result = new ArrayList<>();
//
//        for (Apple apple : inventory){
//            if (applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//
//        return result;
//
//    }


    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (p.test(apple)){
                result.add(apple);
            }
        }

        return result;

    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }


}
/*
In software engineering, user requirements will change.

Example : Imagine an application to help a farmer understand his inventory.
- Find all green apples in the inventory
- Find all apples heavier than 200 g

As a developer, we have to minimize our engineering effort.
 */