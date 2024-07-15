package Recursion;

public class printStackHight {
    public static int calcpower(int x , int n){
        if (n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int num= calcpower(x,n-1);
        int power = x*num;
    return power;
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int resullt=calcpower(x,n);
        System.out.println(resullt);
    }
}
