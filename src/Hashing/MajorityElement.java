//give an integer array of size n find all elements that appears more than [n/3] times.
//        nums[]={1,3,2,5,1,3,1,5,1};
//        nums[]={1,2};

package Hashing;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
//        int [] nums={1,3,2,5,1,3,1,5,1};
          int [] nums={1,2};

        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0; i< nums.length ; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1 );
            }else {
                map.put(nums[i],1 );
            }
        }

        for (Map.Entry<Integer,Integer> set: map.entrySet() ){
            if (set.getValue()>n/3){
                System.out.println("Elements more than n/3  = "+set.getKey());
            }
        }

    }
}
