package Basic;
//classes and objects

class Stuent{
      String  name;
      int  age;

     public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops{
    public static void main(String[] args) {
        Stuent s1 = new Stuent();
        s1.name = "Aman";
        s1.age = 20;

        s1.getInfo();
    }
}

