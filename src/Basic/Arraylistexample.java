package Basic;

import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Outputs: Apple

        // Iterating over the ArrayList using a for-each loop
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking the size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());

        // Removing an element
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);
    }
}

