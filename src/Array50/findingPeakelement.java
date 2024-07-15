//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
//
//        Note: If the array is increasing then just print the last element will be the maximum value.
//
//        Example:
//
//        Input: array[]= {5, 10, 20, 15}
//        Output: 20
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
//
//        Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//        Output: 20 or 90
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.

package Array50;

import java.util.Arrays;

public class findingPeakelement {
    public static void usingfunction(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }

    public static void usingloops(int[] array) {
        int n = array.length;
        for (int i = 1; i < n - 1; i++) {
            if (n == 0) {
                System.out.println(array[0] + " is the peak element :");
            }
            if (n == 1) {
                if (array[i] > array[i - 1]) {
                    System.out.println(array[i] + " is the peak element :");
                } else {
                    System.out.println(array[i - 1] + " is the peak element :");
                }
            }
            if (array[i] > array[i - 1] && array[i]>array[i+1]){
                System.out.println(array[i]+" is the peak element :");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 20, 15};
        usingfunction(array);
        usingloops(array);
    }
}
