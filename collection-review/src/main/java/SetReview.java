import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        //1. create a set
        Set<Student> mySet = new HashSet<>();

        //2. add elements
        mySet.add(new Student(7,"Ibodat"));
        mySet.add(new Student(8,"Ahmed"));
        mySet.add(new Student(9,"Muhabbat"));//this has a hashcode
        mySet.add(new Student(9,"Muhabbat"));//this has a hashcode too and they are different,
        // so Set thinks that this object is not duplicated
        //so we need to create equals() and hashcode() in the class, hashcode() is used to compare hashcodes

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        numSet.add(2);

        System.out.println(numSet);
        System.out.println(numSet.add(2));//false: as it is a duplicate
        System.out.println("first repeating is: " + firstRepeatingChar("java developer"));

    }
    /*
    Find the first repeating char in a string.
Example:
String=“Java Developer”
Output:
a
     */
    public static Character firstRepeatingChar(String str){
        //create a hashSet
        Set<Character> chars = new HashSet<>();
        //Iteration return ch if add returns false

        for (Character ch : str.toCharArray()) if (chars.add(ch) == false) return ch;
        //add() in Set returns false when same (duplicated) value is added

        return null;
    }

}
