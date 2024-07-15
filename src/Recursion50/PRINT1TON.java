package Recursion50;

public class PRINT1TON {
    public static void trueloop(int n){
        System.out.println(n);
        trueloop(n+1);
    }
    public static void main(String[] args) {
        int n=0;
        trueloop(n);

    }
}
