package functionalInterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //**********PREDICATE***********//

        /*
        Predicate<Integer> lesserThan = new Predicate<Integer>() {//Anonymous class
            @Override
            public boolean test(Integer integer) {
                return integer < 18;
            }
        };

        lesserThan.test(50);
         */

        Predicate<Integer> lesserThan = p -> p<18;//implementation of functional interface method (test)
        Boolean result = lesserThan.test(50);
        System.out.println(result);

        //**********CONSUMER***********//

        Consumer<Integer> display = i -> System.out.println(i);

        display.accept(50);


        //**********BICONSUMER***********//
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x+y);

        addTwo.accept(10,15);

        //**********FUNCTION***********//
        Function<String, String> fun = s -> "Hello " + s;
        String str = fun.apply("Ozzy");
        System.out.println(str);

        System.out.println(fun.apply("Apple"));

        //**********SUPPLIER***********//
        //does not accept any argument, returns Generic Type
        //T get();
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


        Predicate<Integer> pred = p -> p%2==0 ? true : false;
        System.out.println(pred.test(10));

        BiConsumer<Integer, String> bn = (x,y) -> System.out.println(x+y);
        bn.accept(5,"apple");


    }

}
