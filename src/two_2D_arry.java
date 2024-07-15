import java.util.Scanner;

public class two_2D_arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.print("enter the number of row you want to enter = ");
        int n = sc.nextInt();
        System.out.print("enter the number of columns you want to enter = ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i=0 ; i<n ; i++){
            for (int j=0; j<m ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
//        System.out.print("Enter the number you want to find = ");
//        int find = sc.nextInt();
//        for (int i=0; i<n ; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == find) {
//                    System.out.print("your number was at " + i + "," + j + " number in the matrix : ");
//                }
//            }
//        }
// Transpose the matrix
        int[][] transposedMatrix = MatrixTranspose( matrix );
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }



        /////////////////////// sprial matrix ///////////////////////////////



//        System.out.println("Lets mow print the spiral matrix ");
//        int colstart=0;
//        int colend=n-1;
//        int rowstart=0;
//        int rowend=m-1;
//
//        while (colstart<=colend && rowstart<=rowend){
//
//            // 1
//            for (int j=colstart ; j<=colend;j++){
//                System.out.print(matrix[rowstart][j]+" ");
//            }
//            rowstart++;
//
//            // 2
//
//            for (int j = rowstart; j<=rowend ; j++){
//                System.out.print(matrix[j][colend]+" ");
//            }
//            colend--;
//
//            //3
//            for (int j=colend;j>=colstart; j--){
//                System.out.print(matrix[rowend][j]+" ");
//            }
//            rowend--;
//
//            //4
//            for (int j=rowend ; j>=rowstart ;j--) {
//                System.out.print(matrix[j][colstart] + " ");
//            }
//            colstart++;
//            System.out.println();
//
//
//        }

    }

    public static int[][] MatrixTranspose(int[][] arry ) {
        int row=arry.length;
        int col=arry[0].length;
        int[][] transpose=new int [col][row];
        for (int i=0; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                transpose[j][i]=arry[i][j];
            }
        }
        return transpose;


    }
}



