package Recursion50;

public class meanOfArray {
    public static void arraymean(int [] array,int total,int i,int mean){
    if (i==array.length-1){
        mean=total/array.length;
        System.out.println("the mean of the array = "+mean);
        return;
        }
    total+=array[i];
    arraymean(array,total,i+1,mean);
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int total = 0;
        int mean=0;
        arraymean(array,total,0,mean);
    }
}
