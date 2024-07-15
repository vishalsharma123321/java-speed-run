package Array50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class intersectionAndUninOFArray {
    static HashSet<Integer> union(int [] array1 , int []array2){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<array1.length; i++ ){
            set.add(array1[i]);
        }
        for (int i=0;i<array2.length; i++ ){
            set.add(array2[i]);
        }
        return set;
    }

    static ArrayList<Integer> intersection(int [] array1 , int[] array2){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<array1.length;i++){
            if (map.containsKey(array1[i])){
                map.put(array1[i],map.get(array1[i])+1);
            } else{
                map.put(array1[i],1);
            }
        }
        for(int i=0;i<array2.length;i++){
            if (map.containsKey(array2[i])){
                map.put(array2[i],map.get(array2[i])+1);
            } else{
                map.put(array2[i],1);
            }
        }

        for(int key :map.keySet()){
            if(map.get(key)>1){
                list.add(key);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int array1[] = {2, 5, 6};
        int array2[] = {4, 6, 8, 10};

        System.out.println(union(array1,array2));
        System.out.println(intersection(array1,array2));
    }
}
