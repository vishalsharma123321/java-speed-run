package Recursion;

public class basicRecursion {
    public static void main(String[] args) {
        int n = 5;
        int ans = factroial(n);
        System.out.println(ans);
    }

    public static int factroial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int n_1 = factroial(n - 1);
        int factroial = n * n_1;

        return factroial;
    }
}
