// Define the Person class
package Basic;

class Person {
    // Properties of the Person class
    String name;
    int age;

    // Method to display person's details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to create an object and test the Person class
public class Oops {
    public static void main(String[] args) {
        // Create an object of Person class
        Person person1 = new Person();

        // Set values to properties
        person1.name = "John";
        person1.age = 25;

        // Call the method to display person's details
        person1.displayInfo();
    }
}

