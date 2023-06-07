import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,2,10,23);

        //empty() - isPresent() - checks if something exists in the Optional object
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        //ifPresent - If a value is present, invokes the specified consumer with the value; otherwise, does nothing
        Optional<Integer> bigNumber = numbers.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get - Returns the value wrapped by this Optional if present; otherwise, throws a NoSuchElementException
        //System.out.println(bigNumber.get());

        //orElse - Returns the value if present; otherwise, returns the given default value
        System.out.println(bigNumber.orElse(0));

    }

}
