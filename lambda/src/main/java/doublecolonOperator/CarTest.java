package doublecolonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {
        //Constructor Reference

        //Zero-argument
        Supplier<Car> c1 = () -> new Car();//default constructor
        System.out.println(c1.get().getModel());

        //Referring to Constructor of Car class
        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One-argument

        Function<Integer, Car> f1 = make -> new Car(make);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getMake());

        Function<Integer, Car> f2 = Car::new;
        Car bmw2 = f2.apply(2015);
        System.out.println(bmw2.getMake());

        //Two argument
        BiFunction<Integer, String, Car> b1 = (make, model) -> new Car(make, model);
        Car honda = b1.apply(2007,"Honda");
        System.out.println(honda.getMake() + " " + honda.getModel());

        BiFunction<Integer, String, Car> b2 = Car::new;
        Car nissan = b2.apply(2001,"Nissan");
        System.out.println(nissan.getMake() + " " + nissan.getModel());

    }

}
