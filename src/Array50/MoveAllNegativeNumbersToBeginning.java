package Array50;

import java.util.Arrays;
public class MoveAllNegativeNumbersToBeginning {
        public static void main (String[] args) {
            int[] array = {-12, 11, 4, 8 - 13, -5, 6, -3, 8};
            Arrays.sort(array);
            for (int i: array){
                System.out.println(i);
            }
    }
}
