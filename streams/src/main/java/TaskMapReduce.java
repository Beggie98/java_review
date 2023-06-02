public class TaskMapReduce {

    public static void main(String[] args) {

        int dishCount = DishData.getAll().stream()
                .map(dish -> 1)
                .reduce(0, (a,b) -> a+b);

        System.out.println(dishCount);

        long dCount = DishData.getAll().stream().count();
        System.out.println(dCount);

    }

}
/*
How would you count the number of dishes in a stream using the map
and reduce methods?
 */