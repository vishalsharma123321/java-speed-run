package slidingWindow_And_2Pointers;

import java.util.Arrays;
public class lettCode_1423_MaximumPointsYoCanObtainfromCards {
    static int maxScore(int [] cardPoints , int k){
        // Initialize leftsum
        // and rightsum  to 0.

        int leftsum=0;
        int rightsum=0;

        // Initialize the
        // maximum sum (maxSum) to 0.
        int maxsum=0;

        // Set rIndex to the index of
        // the last element in cardPoints.
        int rightindex=cardPoints.length-1;

        // Calculate the sum of the first k
        // elements from the left side of the array.
        for(int i=0 ; i<k ; i++){
            leftsum+=cardPoints[i];
        }
        // Initialize maxSum to the sum of
        // the first k elements from the left.
        maxsum=leftsum;

        // Move one element from the
        // left to the right at a time.
        for(int i=k-1 ; i>=0 ;i--){
            // Subtract the current element from
            // lsum as it's moved to the right.
            leftsum-=cardPoints[i];

            // Add the current right
            // element to rsum.
            rightsum+=cardPoints[rightindex];

            // Decrease the right index to point
            // to the next element on the left.
            rightindex-=1;

            // Update maxSum to the maximum value
            // between the current maxSum and
            // the sum of leftsum and rightsum.

            // using Math.max to find the largerst among them
            maxsum=Math.max(maxsum,leftsum+rightsum);

            // using ternary operator to find the larget among them
            // maxsum=(maxsum>(leftsum+rightsum))? maxsum:leftsum+rightsum;

        }
        // Return the maximum sum obtained.
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};
        int k = 7;

        System.out.println("Given cards: " + Arrays.toString(arr));
        System.out.println("Number of cards to pick: " + k);

        int result = maxScore(arr, k);

        System.out.println("Maximum score: " + result);
    }
}
