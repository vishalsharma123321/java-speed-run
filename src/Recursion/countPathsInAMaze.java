package Recursion;

public class countPathsInAMaze {
    static int recursion(int i ,int j ,int n , int m){
        if(i==n || j==m){
            return 0 ;
        }
        if (i==n-1 && j==m-1){
            return 1;
        }
        int downPath = recursion(i+1,j,n,m);
        int rightPath = recursion(i,j+1,n,m);
        return downPath + rightPath ;
    }

    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(recursion(0,0,n,m));

    }
}
