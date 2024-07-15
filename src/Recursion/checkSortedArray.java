package Recursion;

public class checkSortedArray {

    public static boolean sortedArray(int[] array , int index ) {
        if (index==array.length-1){
            return true;
        }
        if (array[index]<array[index+1]){
            return sortedArray(array,index+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int [] array={1,2,3,10,4,5};
        boolean resutlt=sortedArray(array,0);
        System.out.println(resutlt);
    }
}
