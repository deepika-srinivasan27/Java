package Basic;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {12, 13, 14, 15, 16};

        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < 5; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        for(int num : arr1) {
//            System.out.println(num);
//        }


        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(20);
        lst.add(80);
        lst.add(60);
        lst.remove(2);
        boolean bool = lst.contains(30);
        System.out.println(lst.get(0));
    }
}
