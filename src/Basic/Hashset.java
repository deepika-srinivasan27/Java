package Basic;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        System.out.println(set);

        //search if contains
        if(set.contains(1)){
            System.out.println("set contains");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //remove
        set.remove(1);
        System.out.println(set);

        //size
        System.out.println("size is " + set.size());

        //iterator

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
