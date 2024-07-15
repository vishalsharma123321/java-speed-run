//Given an array arr[] of size N and a number K, where K is smaller than the size of the array.
// Find the K’th smallest element in the given array. Given that all array elements are distinct.
//
//        Examples:
//
//        Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
//        Output: 7
//
//        Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4
//        Output: 10

package Array50;
import java.util.Arrays;
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int k=3;
        Arrays.sort(array);
        System.out.println(array[k-1]);
    }
}
