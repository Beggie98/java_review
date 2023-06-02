import java.util.Comparator;
import java.util.List;

public class DishTask {

    public static void main(String[] args) {

        //print all dish's name that has less than 400 calories
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)//dishes with less than 400 calorie are flowing
                .map(Dish::getName)//only names are flowing
                .forEach(System.out::println);

        //Print the length of the name of each dish
        System.out.println("***************************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print Three High Caloric Dish Name(>300)
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 calories in sorted
        System.out.println("***************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())//descending
                .map(Dish::getName)
                .forEach(System.out::println);

    }

}
