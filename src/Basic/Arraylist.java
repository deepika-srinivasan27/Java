package Basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(3);
        list.add(5);

        System.out.println(list);

        // get element

        int element = list.get(1);
        System.out.println(element);

        //add element in between the list

         list.add(1,1);
         System.out.println(list);

         //set element

        list.add(0,5);
        System.out.println(list);

        //remove element

        list.remove(3);
        System.out.println(list);

        //size
        int size =list.size();
        System.out.println(size);

//        //loop
//        for(int i = 0; i<list.size();i++){
//            System.out.print(i);
//        }
//        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
