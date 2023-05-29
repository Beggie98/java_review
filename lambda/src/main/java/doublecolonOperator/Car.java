package doublecolonOperator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

    private int make;
    private String model;

    public Car() {
    }

    public Car(int make) {
        this.make = make;
    }

    public Car(int make, String model) {
        this.make = make;
        this.model = model;
    }
}
