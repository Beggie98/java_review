package tasks.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        /*
        StateData.getAll().stream()
                .map(State::getCities)
                .forEach(System.out::println);
         */
        StateData.getAll().stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }

}
