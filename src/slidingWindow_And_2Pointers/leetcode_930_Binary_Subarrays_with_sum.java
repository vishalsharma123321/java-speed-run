package slidingWindow_And_2Pointers;
import java.util.HashMap;

public class leetcode_930_Binary_Subarrays_with_sum {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize the map with a prefix sum of 0 having count 1
        map.put(0, 1);
        // Initialize the cumulative sum and answer variables
        int sum = 0;
        int ans = 0;
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the cumulative sum
            sum += nums[i];
            // Check if there is a prefix sum that, when subtracted from the current sum, equals the goal
            if (map.containsKey(sum - goal)) {
                ans += map.get(sum - goal);
            }
            // Update the hashmap with the current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        // Return the total number of valid subarrays found
        return ans;
    }
    public static void main(String[] args) {

        // Test cases
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal)); // Expected output: 4

    }
}
/*
Explanation with Example
Let's go through the example nums = [1,0,1,0,1] and goal = 2 step-by-step:

Initialization:

nums = [1, 0, 1, 0, 1]
goal = 2
map = {0: 1}
sum = 0
ans = 0
Iteration:

i = 0 (nums[0] = 1):
sum = 0 + 1 = 1
map = {0: 1}
map.put(1, map.getOrDefault(1, 0) + 1) = map.put(1, 1)
map = {0: 1, 1: 1}
i = 1 (nums[1] = 0):
sum = 1 + 0 = 1
map = {0: 1, 1: 1}
map.put(1, map.getOrDefault(1, 0) + 1) = map.put(1, 2)
map = {0: 1, 1: 2}
i = 2 (nums[2] = 1):
sum = 1 + 1 = 2
map = {0: 1, 1: 2}
if (map.containsKey(2 - 2)) ans += map.get(0) = 1
ans = 1
map.put(2, map.getOrDefault(2, 0) + 1) = map.put(2, 1)
map = {0: 1, 1: 2, 2: 1}
i = 3 (nums[3] = 0):
sum = 2 + 0 = 2
map = {0: 1, 1: 2, 2: 1}
if (map.containsKey(2 - 2)) ans += map.get(0) = 1
ans = 2
map.put(2, map.getOrDefault(2, 0) + 1) = map.put(2, 2)
map = {0: 1, 1: 2, 2: 2}
i = 4 (nums[4] = 1):
sum = 2 + 1 = 3
map = {0: 1, 1: 2, 2: 2}
if (map.containsKey(3 - 2)) ans += map.get(1) = 2
ans = 4
map.put(3, map.getOrDefault(3, 0) + 1) = map.put(3, 1)
map = {0: 1, 1: 2, 2: 2, 3: 1}
The total number of subarrays with a sum equal to 2 is 4.

Time and Space Complexity:
Time Complexity: O(n), where n is the length of the array nums. We iterate through the array once.
Space Complexity: O(n), in the worst case where all prefix sums are unique and stored in the hashmap.
 */