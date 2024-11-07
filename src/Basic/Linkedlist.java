package Basic;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Adding elements at the beginning and end
        numbers.addFirst(5);  // Adds 5 at the beginning
        numbers.addLast(35);   // Adds 35 at the end

        // Accessing elements
        System.out.println("First number: " + numbers.getFirst()); // Outputs: 5
        System.out.println("Last number: " + numbers.getLast());   // Outputs: 35

        // Iterating over the LinkedList using a for-each loop
        System.out.println("Numbers in the list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Checking the size of the LinkedList
        System.out.println("Total numbers: " + numbers.size());

        // Removing an element
        numbers.remove(2); // Removes the element at index 2
        System.out.println("Numbers after removing element at index 2: " + numbers);
    }
}

