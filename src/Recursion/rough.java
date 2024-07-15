package Recursion;
import java.util.HashSet;
import java.util.Iterator;
import  java.util.*;
public class rough {
    public int firstNonRepeating(int arr[], int n)
    {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap <>();
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for( Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()==1){
                ans=e.getValue();
            }else{
                ans=0;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int []A = {1, 5, 10, 20, 40, 80};
        int []B = {6, 7, 20, 80, 100};
        int []C = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1=6;
        int n2=5;
        int n3=8;

//        System.out.println(commonElements(A,B,C,n1,n2,n3));
    }
    }




















//Pattern pattern = Pattern.compile(regex);
//Matcher matcher = pattern.matcher(email);
//
//            if (matcher.matches()) {
//        System.out.println(email + " is a valid email address.");
//            } else {
//                    System.out.println(email + " is not a valid email address.");
//            }