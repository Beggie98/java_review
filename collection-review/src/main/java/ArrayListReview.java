import java.util.*;
import java.util.function.Consumer;

public class ArrayListReview {

    public static void main(String[] args) {
        //Create Arraylist and a class
        List<Student> students = new ArrayList<>();
        //Add Elements to Arraylist
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Sayed"));
        students.add(new Student(4,"Ronnie"));

        System.out.println(students);

        System.out.println("----Printing with for loop------------------------------------");

        //Iteration on ArrayLists
            //1. For Loop with get(index)
        for (int i = 0; i < students.size(); i++) System.out.println(students.get(i));

        System.out.println("----Printing with iterator (Forward Iteration)------------------------------------");

            //2. Iterator
        // Forward Iteration
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Backwards Iteration
        System.out.println("----Printing with iterator (Backwards Iteration)------------------------------------");

        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

            //3. for each loop
        System.out.println("----Printing with For Each loop---------------------------------");
        for (Student student : students) System.out.println(student);


            //4. Lambda
        System.out.println("-------Lambda-------------------------");

        students.forEach(student -> System.out.println(student));

        //Sorting elements in List
        System.out.println("------Printing with sorted List using comparator-----------------");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);




    }

    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }


}
