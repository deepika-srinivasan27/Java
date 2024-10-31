package Basic;

class Student {
    protected String name;
    int roll;
    int marks;

    Student() {
        name = "XYZ";
        roll = 0;
        marks = 10;
    }

    Student(String n) {
        name = n;
    }

    public void getName() {
        System.out.println(name);
    }
}

class School extends Student {
    public void getName() {

    }
}

public class Classes {
    public static void main(String[] args) {
        Student Prachi = new Student("Prachi");
        Student Deepika = new Student();
        System.out.println(Prachi.name);
    }
}
