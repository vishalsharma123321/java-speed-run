//Intersection of 2 Arrays
//        arr1={7,3,9};
//        arr2={6,3,9,2,9,4};
//        intersection=2(3,9)


package Hashing;
import java.util.*;
public class interSectionOf2Arrays {
    public static void main(String[] args) {
        int [] arr1={7,3,9};
        int [] arr2={6,3,9,2,9,4};
        int insertion = 0;
        Set<Integer> set =new HashSet<>();
    for (int i=0 ; i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for (int i=0 ; i<arr2.length;i++){
        if (set.contains(arr2[i])){
            insertion+=1;
            set.remove(arr2[i]);
        }
    }
        System.out.println(insertion);
    }
}
