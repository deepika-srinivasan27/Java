package Basic;

import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        add(a, b);
//        int sum = addition(a, b);
//        System.out.println(sum);
    }

    public static void add(int a, int b, int c) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(String a, int b) {
        return 0;
    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
