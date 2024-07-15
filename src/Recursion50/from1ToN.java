package Recursion50;

public class from1ToN {
    public static void nto1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        nto1(n);
    }
}
