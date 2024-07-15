package Hashing;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
       // add
       set.add(25);
       set.add(50);
       set.add(75);
       set.add(75);
       set.add(100);
       set.add(100);


       // contains
       if(set.contains(100 )) {
           System.out.println("set conatines 50");
       }
        System.out.println(set);


       // remove
        set.remove(50);
        System.out.println(set);

        if (!set.contains(50)){
            System.out.println("set does not contains 50 ");
        }

        // printing size
        System.out.println(set.size());
        set.add(7);
        var size = set.size();
        System.out.println(size);


        // iterator
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
