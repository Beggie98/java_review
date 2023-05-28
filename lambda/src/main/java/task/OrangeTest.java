package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        //advantage of @Builder is that we don't have to give value to every field for the constructor (default values will be assigned)
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        //Behavior parameterization using lambda
        OrangeFormatter simpleFormatter =  orange -> "An orange of " + orange.getWeight() + "g";
        //prettyPrintOrange(inventory, simpleFormatter);

        //we can paste the action directly to the method
        prettyPrintOrange(inventory,orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("----------------");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };


        prettyPrintOrange(inventory, fancyFormatter);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }


}
