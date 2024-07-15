//Given a sorted array arr[] of size N and a number X, you need to find the number of occurrences of X in given array.
//
//Note: Expected time complexity is O(log(n))
//
//Examples:
//
//Input: N = 7, X = 2, Arr[] = {1, 1, 2, 2, 2, 2, 3}
//Output: 4
//Explanation: 2 occurs 4 times in the given array.
//
//        Input: N = 7, X = 4, arr[] = {1, 1, 2, 2, 2, 2, 3}
//Output: 0
//Explanation: 4 is not present in the given array.

package Array50;
public class CountumberOfOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2, 3};
        int n = 2;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
                if (array[i] == n) {
                    count += 1;
                }
        }

        if (count==0){
            System.out.println("number does not exist in the array ");
        }else {
            System.out.println("The number " + n + " has occured " + count + " times : ");
        }

    }
}