package slidingWindow_And_2Pointers;

public class leetcode_1004_Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int r = 0; // Right pointer for the sliding window
        int l = 0; // Left pointer for the sliding window
        int maxlength = 0; // Variable to keep track of the maximum length of the subarray
        int zeros = 0; // Variable to count the number of zeros in the current window

        while (r < nums.length) { // Iterate through the array with the right pointer
            if (nums[r] == 0) {
                zeros++; // Increment the count of zeros if the current element is 0
            }

            // If the count of zeros exceeds k, shrink the window from the left
            if (zeros > k) {
                if (nums[l] == 0) {
                    zeros--; // Decrement the count of zeros if the element at the left pointer is 0
                }
                l++; // Move the left pointer to the right to reduce the window size
            }

            // If the count of zeros is within the allowed limit, update the maximum length of the subarray
            if (zeros <= k) {
                maxlength = Math.max(maxlength, r - l + 1);
            }

            // Move the right pointer to the right to expand the window
            r++;
        }

        // Return the maximum length of the subarray found
        return maxlength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestOnes(nums, k)); // Should print 10
    }
}
