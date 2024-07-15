package Recursion50;

public class sumOfNaturalNumbers {
    public static void sumofnaturalnumbers(int n,int i,int total){
        if (i==n+1){
            System.out.println("total of all natural numbers = "+total);
            return;
        }
        total+=i;
        sumofnaturalnumbers(n,i+1,total);
    }
    public static void main(String[] args) {
        int n=6;
        int total=0;
        sumofnaturalnumbers(n,1,total);
    }
}
