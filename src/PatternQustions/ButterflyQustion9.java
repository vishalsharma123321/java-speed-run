package PatternQustions;

public class ButterflyQustion9 {
    public static void main(String[] args) {
        int n=10;
        for (int i=1 ; i<=n ;i++){
            for (int j=1;j<=i ;j++){
                System.out.print("*");
            }
            for (int j=n-i ;j>0 ;j--){
                System.out.print(" ");
            }
            for (int j=n-i ;j>0 ;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1 ;i<=n ;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for (int j=i-2 ; j>=0 ;j--){
                System.out.print(" ");
            }
            for (int j=1+1 ;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=n-i+1 ;j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
