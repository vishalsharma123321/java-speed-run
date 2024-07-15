package Sort;

public class ROUGH {
    public static void main(String[] args) {
        int [] arr={577, 420, 210, 723, 767, 589};
        int high=arr.length;
        quicksort(arr,0,high-1);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void quicksort(int []arr,int low,int high){
        if (low<high){
            int pindex=partion(arr,low,high);
            quicksort(arr,low,pindex-1);
            quicksort(arr,pindex+1,high);
        }
    }

    public static int partion(int [] arr , int low ,int high){
        int pivot= arr[high];
        int i = low-1;
        for (int j=low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
    return i;}
}


