//Given an array, write functions to find the minimum and maximum elements in it.
package Array50;

import java.util.Arrays;
public class minMaxinArray {
    public static void usingfunction(int [] array){
        Arrays.sort(array);
        int n=array.length-1;
        System.out.println("min = "+array[0]+" max = "+array[n]);
    }

    public static void usingloops(int [] array) {
        int min = array[1];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }else {
                max=array[i];
            }
        }

        System.out.println("min = "+ min);
        System.out.println("min = "+ max);
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        usingloops(array);
//        usingfunction(array);
    }
}
