package Recursion;

public class numbersOfWayToInviteNPeoplesToYourPartySingleOrPairs {

    static int recursion(int n) {
        if (n <= 1) {
            return 1;
        }

        int way1 = recursion(n - 1);
        int way2 = (n - 1) * recursion(n - 2);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 4;
        int m=5;
        System.out.println(recursion(n));
    }
}
