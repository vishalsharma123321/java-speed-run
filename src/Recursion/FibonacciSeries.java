package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.println(a+"\n"+b);
        fibonacciSeries(a,b,n-2);
    }

    public static void fibonacciSeries(int a , int b, int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacciSeries(b,c,n-1);
    }
}
