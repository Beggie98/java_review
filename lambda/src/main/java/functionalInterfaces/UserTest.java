package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("John").lastName("Egony").age(32).build());
        users.add(User.builder().firstName("Patrick").lastName("Jane").age(35).build());
        users.add(User.builder().firstName("Leon").lastName("Edwards").age(34).build());
        users.add(User.builder().firstName("Emily").lastName("Roberts").age(26).build());

        //Print all elements in the list
        printName(users, p -> true);//we want to print everything here
                      //implementation of the behavior


        /*
        Consumer<List<User>> printElements = list -> {
            for( User user : list){
                    System.out.println(user);
                }
            };
         */

        System.out.println("------------------------");

        //Print all users that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));


        /*
        Consumer<List<User>> printLastNamesStartWithE = list -> {
          for (User user : list){
              if (user.getLastName().startsWith("E")){
                  System.out.println(user);
              }
            }

        };
         */


    }

    private static void printName(List<User> users, Predicate<User> p){
                                                    //Behavior
        for (User user : users){
            if (p.test(user)){//boolean result will be assigned here
                System.out.println(user.toString());
            }
        }
    }

}
