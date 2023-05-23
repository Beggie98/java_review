package review;

import java.util.List;

public class MyUtils <T extends Person> {//class level generic type, we can only use it with instance methods
                     // T type can only be objects of the classes that extend Person (Student, Teacher)
    public void printInfo2(List<T> list){

        for (T item : list){
            System.out.println(item);
        }

        System.out.println("Total number: " + list.size());

    }

    //Write a method that takes a list and returns the last item of the list

    public T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }

    //Write a method that takes a list and returns the last item name of the list. (Student and Teacher only)
    // instanceOf
    public String getLastItemName(List<T> list){
        T lastItem = list.get(list.size()-1);

        if (lastItem instanceof Student){
            return ((Student) lastItem).getName();
        }else if (lastItem instanceof Teacher){
            return ((Teacher) lastItem).getName();
        }else {
            throw new RuntimeException("Not a valid type");
        }
    }

}
