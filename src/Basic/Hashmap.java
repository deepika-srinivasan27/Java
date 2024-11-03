package Basic;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 20);
        map.put("Japan",80);
        map.put("Europe",10);
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("exists");
        }else{
            System.out.println("not exists");
        }
    }
}
