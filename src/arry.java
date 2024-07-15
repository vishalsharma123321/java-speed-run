import java.util.Scanner;

public class arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of you arry = ");
        int size = sc.nextInt();
        int arry[]=new int[size];
        for (int i = 0 ; i<size ;i++ ) {
            arry[i]=sc.nextInt();
        }
        int min = arry[0];
        int max = arry[0];
        System.out.print("enter which number you want to find in the arrry = ");
        int find = sc.nextInt();
        order(arry,size);

        for (int i=0 ; i<size ;i++ ){
            if(arry[i]==find){

                System.out.println("your number is at the "+ i + " position.");
            }}
        int count = 0;
        for (int i= 0 ; i<size-1 ; i++){
            if (arry[i]<min) {
                min=arry[i];
            }
            if (arry[i]>max){
                max=arry[i];
            }

        }

        System.out.println("the gretest value in the arry is = "+max+"\nthe smallest value in the arry is = "+min);
    }
    public static void order(int [] arry ,int size){
        boolean accending=true;
        for (int i=0 ; i<size-1 ;i++ ) {
            if (arry[i + 1] > arry[i]) {

            } else {
                accending =false;
            }
    }
        if (accending){
            System.out.println("your arry is acending order ");
        }
        else {
            System.out.println("your arry is not in acending order ");
        }
    }
}

