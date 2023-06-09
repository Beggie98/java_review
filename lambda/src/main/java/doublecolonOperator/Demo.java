package doublecolonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        //Method References (shorthand for lambdas)
        //Referring to the static method of Calculator class
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;//shortcut
        s2.calculate(100,35);

        //Referring to the instance method of Calculator class
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(5,6);

        Calculator obj1 = new Calculator();
        Calculate m2 = obj1::findMultiply;//shortcut
        m2.calculate(8,9);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(6,6);


        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);


        BiFunction<MyClass, Integer, Double> v2 = MyClass::method;
        //we are calling instance method through the class name with the help class type included in the interface
        //we don't have to use new keyword now

        BiFunction<String, String, String> v3 = String::concat;


    }
}
