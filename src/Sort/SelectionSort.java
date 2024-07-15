package Sort;


//  Selection Sort;
// Big O(n^2);
public class SelectionSort {
    public static void main(String[] args) {
        Integer [] arry = {782, 290, 491, 286, 214, 264, 645, 421, 456, 36};

        for (int i=0 ; i< arry.length-1 ; i++){
            int smallest = i;
            for (int j=i+1; j<arry.length;j++){
                if (arry[smallest]>arry[j]){
                    smallest = j;
                }
                int temp=arry[i];
                arry[i]=arry[smallest];
                arry[smallest]=temp;
            }
        }

        for (int i:arry){
            System.out.println(i);
        }

    }
}
