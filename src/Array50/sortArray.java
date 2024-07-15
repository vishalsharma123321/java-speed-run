package Array50;
import java.util.Arrays;
public class sortArray {
    public static void sortedarray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }


    public static void sortedarraybyfunction(int[] array) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

        public static void main (String[]args){
            int[] array = {5, 3, 7, 2, 9, 1, 55};
            sortedarray(array);
//        sortedarraybyfunction(array);
        }

}