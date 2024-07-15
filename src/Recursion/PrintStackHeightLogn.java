package Recursion;

public class PrintStackHeightLogn {
    public static int powerfun(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
             return powerfun(x, n / 2) * powerfun(x, n / 2);
        } else {
            return powerfun(x, n / 2) * powerfun(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int result = powerfun(x,n);
        System.out.println(result);

    }
}
