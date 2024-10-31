package Basic;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        byte b = 30;
        int a = 10;
        long l = 30;

        float f = 23.4f;
        double d = 34.890;

        char c = 'a';

        boolean bool = true;

        // Non Primitive
        String s = "Prachi";
        String s1 = new String("Deepika");

        int[] arr = new int[20];

        for(int i = 1; i < 11; i++) {

        }

//        int i = 20;
//
//        while(i > 5) {
//            if(i % 2 == 0) {
//                i = i + 2;
//            }
//            else {
//                i + 1;
//            }
//        }

//        int i = 10;
//        do {
//
//        }while(i > 2);

        int weekdays = 1;
        switch(weekdays) {
            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Nothing");
                break;
        }
    }
}
