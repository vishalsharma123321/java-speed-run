package Sort;
// Bubble sort
// timpe complexity = Big O (n^2);

public class BubbleSort {
    public static void main(String[] args) {
        int[] arry = {26, 282, 486, 506, 50, 985, 332, 967, 627, 383};

        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - i - 1; j++) {
                if (arry[j] < arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}

