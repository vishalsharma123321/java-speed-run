package Array50;

public class Suffix_MAx_Difffrenc_between_2_Element {
    // Function to find the maximum difference between an element and the maximum element to its right
    static int solution(int nums[]) {
        // Initialize maxdiff to the smallest possible value to ensure any valid difference will be larger
        int maxdiff = Integer.MIN_VALUE;
        // Initialize bignum to the last element of the array
        int bignum = nums[nums.length - 1];

        // Iterate from the second last element to the first element of the array
        for (int i = nums.length - 2; i >= 0; i--) {
            // Update bignum to be the maximum of its current value or the current element nums[i]
            bignum = Math.max(bignum, nums[i]);
            // Update maxdiff to be the maximum of its current value or the difference between bignum and the current element nums[i]
            maxdiff = Math.max(maxdiff, bignum - nums[i]);
        }
        // Return the maximum difference found
        return maxdiff;
    }

    public static void main(String[] args) {
        // Example array
        int nums[] = {9, 5, 8, 12, 2, 3, 7, 4};
        // Call the solution function and print the result
        System.out.println(solution(nums)); // Output: 7
    }
}
