package Recursion;

public class TowerOfHanoi {
    public static void toweofhanoi(int n, String source , String helper , String destination){
        if (n==1){
            System.out.println("Transfer disk "+ n + " from "+source+" to "+ destination);
            return;
        }
        toweofhanoi(n-1,source,destination,helper);
        System.out.println("Transfer disk "+ n+ " from "+source+" to "+ destination);
        toweofhanoi(n-1,helper,source,destination);
    }

    public static void main(String[] args) {
        int n=4;
        toweofhanoi(n,"source","helper","destination");
    }
}
