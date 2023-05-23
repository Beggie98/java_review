import java.util.ArrayList;

public class ArraylistExample {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();//class type checking

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("apple");//compile error

        printDouble(items);



    }

    /*
    private static void printDouble(ArrayList items){
        for (Object each : items){//Object is parent of all objects

            System.out.println((Integer) each * 2);

        }
    }
     */

    private static void printDouble(ArrayList<Integer> items){
        for (Integer each : items){
            System.out.println(each * 2);

        }
    }


}
