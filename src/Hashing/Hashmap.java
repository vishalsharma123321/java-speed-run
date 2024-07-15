package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        // key // value
        HashMap<String, Integer> map = new HashMap<>();
        // we are using HashMap to input entries.
        map.put("India", 1000);
        map.put("China", 10000);
        map.put("Us", 5000);
        map.put("Dubai", 750);
//        System.out.println();
        // printing the full map items.
//        System.out.println(map);
//
//        System.out.println();
//        // geting the value of key india which is 1000.
//        System.out.println( map.get("India"));
//        System.out.println(map.containsKey("India"));
//
//
//        // let's iterate HashMap using Loops .
        System.out.println("################# Iteration ###############333");
        for (Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e);
            System.out.println();
            System.out.println(e.getKey()+" "+e.getValue());


        }
        // this is how we remove the key and value using HashMap.
        map.remove("China");
        System.out.println(map);
//
//        // we are using Map to input the entries . this is the first method
//        Map<Integer, String> students = Map.of(1, "vishal", 2, "rani", 3, "karan", 4, "hamant", 5, "ajay");
//        System.out.println();
//        System.out.println(students);
//
//
//
//
//        // second why of inputting in Map .
//        Map<String, Integer> cars = Map.ofEntries(
//                Map.entry("TATA", 1),
//                Map.entry("KIA", 2),
//                Map.entry("Skoda", 3)
//        );
//        System.out.println();
//        System.out.println(cars);


    }

}
