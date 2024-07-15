package Stack;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class rough {

  static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0 ; i<n1 ; i++ ){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],0);
            }
        }
        for(int i=0 ; i<n2 ; i++ ){
            if(map.containsKey(B[i])){
                map.put(B[i],map.get(B[i])+1);
            }else{
                map.put(B[i],0);
            }
        }
        for(int i=0 ; i<n3 ; i++ ){
            if(map.containsKey(C[i])){
                map.put(C[i],map.get(C[i])+1);
            }else{
                map.put(C[i],0);
            }
        }

        for(int key : map.keySet() ){
            if(map.get(key)>0){
                list.add(key);
            }
        }

        return list;
    }
    public static void main(String[] args) {
      int []  A = {1, 5, 10, 20, 40, 80};
      int []  B = {6, 7, 20, 80, 100};
      int []  C = {3, 4, 15, 20, 30, 70, 80, 120};
      int n1=6;
      int n2=5;
      int n3=8;
        System.out.println(commonElements(A,B,C,n1,n2,n3));
  }
    }


