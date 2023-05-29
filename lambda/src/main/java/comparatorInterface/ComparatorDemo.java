package comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //Descending order using Comparator through Behavior Parameterization
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        //through Lambda
        Collections.sort(list, ((o1,o2) -> (o1>o2) ? -1 :(02<01)? 1 : 0));

        //Ascending

        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);


        //Descending
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);

        //o1,o2 are consequetive elements of the list


        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );

        //sorting objects based on the weight
        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(Comparator.comparing(apple -> apple.getWeight()));

        myInventory.sort(Comparator.comparing(Apple::getWeight));

        //Reversed order
        myInventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(myInventory);

        //Chaining
        myInventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(myInventory);


    }

}
