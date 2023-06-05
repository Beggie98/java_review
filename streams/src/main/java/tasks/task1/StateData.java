package tasks.task1;

import java.util.Arrays;
import java.util.List;

public class StateData {

    public static List<State> getAll(){
        State il = new State();
        il.addCity("Chicago");
        il.addCity("Lemont");
        il.addCity("South Holland");

        State ga = new State();
        ga.addCity("Atlanta");
        ga.addCity("Macon");
        ga.addCity("Newnan");

        State oh = new State();
        oh.addCity("Mason");
        oh.addCity("Columbus");
        oh.addCity("Cleveland");

        return Arrays.asList(il,ga,oh);

    }

}
