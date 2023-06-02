import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2154948165","1561529521")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("8971568451","89524687984")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("9895944844","65617563511"))
        );
    }

}
