package Array50;

public class subArrayWithSum {
    static int [] reccursion(int [] array ,int sum ){
        int length=array.length;
        int[] newarray=new int [2];
        for (int i=0;i<length;i++ ){  //1
            int total =0;
            for (int j=i;j<length ;j++ ){
                total+=array[j];
                if (total==sum){
                    newarray[0]=i;
                    newarray[1]=j;
                }
            }
        }
        return newarray;
    }
    public static void main(String[] args) {
//        int array[] = {1, 4, 20, 3, 10, 5} ;
        int [] array = {1, 4, 0, 0, 3, 10, 5};
        int sum = 7;
        for (int i: reccursion(array , sum)){
            System.out.println(i);
        }

    }
}
