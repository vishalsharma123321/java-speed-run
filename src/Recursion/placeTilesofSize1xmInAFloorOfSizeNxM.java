package Recursion;

public class placeTilesofSize1xmInAFloorOfSizeNxM {

    static int recursion(int n , int m ){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }

        int verticalTiles= recursion(n-m , m);
        int horizontalTiles = recursion(n-1,m);
        return verticalTiles+horizontalTiles;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(recursion(n,m));
    }
}
