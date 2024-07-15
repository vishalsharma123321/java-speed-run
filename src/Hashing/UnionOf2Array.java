//Union of 2 arrays
//        arrl (7, 3, 9)
//        arr2 = (6, 3, 9, 2, 9, 4)
//        union = 6 (7, 3, 9, 6, 2, 4)


package Hashing;
import java.util.*;
public class UnionOf2Array {
    public static void main(String[] args) {
        int [] arr1= {7,3,9};
        int [] arr2 = {7,3,9,6,2,4};

        Set<Integer> set =new HashSet<>();

        for (int i=0 ; i<arr1.length ; i++){
            set.add(arr1[i]);
        }for (int i=0 ; i<arr2.length ; i++){
            set.add(arr2[i]);
        }

        System.out.println(set);

    }
}
