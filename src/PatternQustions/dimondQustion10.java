package PatternQustions;

public class dimondQustion10 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1 ;i<=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j=n-i-1; j>=0;j--){
                System.out.print(" ");
            }for (int j=n-i-1; j>=0;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
