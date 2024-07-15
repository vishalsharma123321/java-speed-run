//Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
//
//Input: original_array[] = {4, 5, 1, 2}
//Output: array_reversed[] = {2, 1, 5, 4}Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
//
//Input: original_array[] = {4, 5, 1, 2}
//Output: array_reversed[] = {2, 1, 5, 4}



package Array50;

public class reverseArray {
public static void reverseArray(int [] array) {
    int[] newarray = new int[array.length];
    int j=0;
    for (int i = array.length - 1; i >= 0; i--) {
            newarray[j] = array[i];
            j++;
    }
        for (int i : newarray) {
            System.out.println(i);
        }
}
    public static void main(String[] args) {
        int [] original_array= {4, 5, 1, 2};
        reverseArray(original_array);
    }
}

