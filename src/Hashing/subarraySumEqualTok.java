package Hashing;
import java.util.*;
public class subarraySumEqualTok {
    public static void main(String[] args) {
        int [] arr ={1,5,-2,0,3,1,-20,10,3};
//        int [] arr = {2,4,1,5,2,1,1,3,2};
//        int [] arr = {2,2,2,-1,2,5};
        int k= 4;  // -10;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //(0,1)
        int sum=0;
        int ans=0;
        for (int i=0; i< arr.length;i++){
            sum+=arr[i]; // 12

            if (map.containsKey(sum-k)){ //7-7 =  0
                ans+=map.get(sum-k); //+1
            }
            if (map.containsKey(sum)){  //2   4
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);  // (0,1),(2,1),(4,1)(6,1)(7,1)
            }
        }
        System.out.println(ans);
    }
}
