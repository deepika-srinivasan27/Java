package Basic;

import java.util.LinkedList;

public class Sorted {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> sortedList = new LinkedList<>();

        // Adding elements in a sorted manner
        addInSortedOrder(sortedList, 30);
        addInSortedOrder(sortedList, 10);
        addInSortedOrder(sortedList, 20);
        addInSortedOrder(sortedList, 40);
        addInSortedOrder(sortedList, 25);

        // Printing the sorted LinkedList
        System.out.println("Sorted LinkedList:");
        for (int number : sortedList) {
            System.out.println(number);
        }
    }

    // Method to add an element in sorted order
    public static void addInSortedOrder(LinkedList<Integer> list, int value) {
        int index = 0;
        for (int element : list) {
            if (element > value) {
                break;
            }
            index++;
        }
        list.add(index, value);
    }
}

