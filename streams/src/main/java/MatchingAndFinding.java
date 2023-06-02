import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {
        //ALL MATCH : Checks if all the elements of the stream match the given predicate. Returns boolean
        System.out.println("**************************");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //ANY MATCH : Checks if all the elements of the stream match the given predicate. Returns boolean
        System.out.println("**************************");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");

        //NONE MATCH : Ensures no elements in the stream match the given predicate. Returns boolean
        System.out.println("**************************");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FIND ANY : Returns any element from a Stream. Returns Optional Type
        System.out.println("**************************");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //FIND FIRST : Returns first element from a Stream. Returns Optional Type
        System.out.println("**************************");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());






    }


}
