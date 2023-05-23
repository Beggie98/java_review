package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));

//        printInfo(studentList);
//        printInfo(teacherList);

        printInfo2(studentList);//List<Student>
        printInfo2(teacherList);//List<Teacher>

        getLastItem(studentList);
        getLastItem(teacherList);


    }

    //Write a method that takes list of students, prints each student and the total student count.

    public static void printInfo(List<Student> students){

        for (Student eachStudent : students){
            System.out.println(eachStudent);
        }

        System.out.println("Total number of students: " + students.size());

    }


    //Write a method that takes list , prints each item and the total  count.

    public static <T> void printInfo2(List<T> list){

        for (T item : list){
            System.out.println(item);
        }

        System.out.println("Total number: " + list.size());

    }

    //Write a method that takes a list and returns the last item of the list

    public static <T> T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }

}
