package slidingWindow_And_2Pointers;
import java.util.HashMap;
public class leetcode_1248_Count_Numbers_of_nice_Subarrays {

    public static int  numberOfSubarrays(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize the map with a prefix sum of 0 having count 1
        map.put(0, 1);
        // Initialize the cumulative sum and answer variables
        int sum = 0;
        int ans = 0;
        for (int n : nums) {
            // Add 1 to the cumulative sum if the current element is odd
            sum += n % 2;
            // Check if there is a prefix sum that, when subtracted from the current sum, equals the goal
            ans += map.getOrDefault(sum - goal, 0);
            // Update the hashmap with the current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int goal = 3;

    }
}

/*
Solution Explanation
The solution uses a prefix sum technique and a hashmap to efficiently count the number of subarrays that meet the criteria.

Initialization:

HashMap<Integer,Integer> map = new HashMap<>();: This hashmap will store the count of prefix sums.
map.put(0,1);: Initialize the map with a prefix sum of 0 having count 1.
int sum=0;: This variable will keep track of the cumulative sum of odd numbers encountered as we iterate through the array.
int ans=0;: This variable will store the number of nice subarrays found.
Iterate over the array:

for (int n : nums): Loop through each element in the array nums.
sum += n % 2;: Add 1 to the cumulative sum if the current element is odd (i.e., n % 2 is 1).
Check for nice subarrays:

ans += map.getOrDefault(sum - k, 0);: Check if there is a prefix sum that, when subtracted from the current sum, equals k. If true, add the count of such prefix sums to the answer.
map.put(sum, map.getOrDefault(sum, 0) + 1);: Update the hashmap with the current sum, incrementing its count.
Return the result:

return ans;: Return the total number of nice subarrays found.
Example: nums = [1,1,2,1,1], k = 3
Let's go through the example step-by-step:

Initialization:

nums = [1,1,2,1,1]
k = 3
map = {0: 1}
sum = 0
ans = 0
Iteration:

n = 1:
sum = 0 + 1 = 1
map = {0: 1}
ans += map.getOrDefault(1-3, 0) = ans += map.getOrDefault(-2, 0) = 0
map.put(1, map.getOrDefault(1, 0) + 1) = map.put(1, 1)
map = {0: 1, 1: 1}
n = 1:
sum = 1 + 1 = 2
map = {0: 1, 1: 1}
ans += map.getOrDefault(2-3, 0) = ans += map.getOrDefault(-1, 0) = 0
map.put(2, map.getOrDefault(2, 0) + 1) = map.put(2, 1)
map = {0: 1, 1: 1, 2: 1}
n = 2:
sum = 2 + 0 = 2
map = {0: 1, 1: 1, 2: 1}
ans += map.getOrDefault(2-3, 0) = ans += map.getOrDefault(-1, 0) = 0
map.put(2, map.getOrDefault(2, 0) + 1) = map.put(2, 2)
map = {0: 1, 1: 1, 2: 2}
n = 1:
sum = 2 + 1 = 3
map = {0: 1, 1: 1, 2: 2}
ans += map.getOrDefault(3-3, 0) = ans += map.getOrDefault(0, 1) = 1
map.put(3, map.getOrDefault(3, 0) + 1) = map.put(3, 1)
map = {0: 1, 1: 1, 2: 2, 3: 1}
n = 1:
sum = 3 + 1 = 4
map = {0: 1, 1: 1, 2: 2, 3: 1}
ans += map.getOrDefault(4-3, 0) = ans += map.getOrDefault(1, 1) = 2
map.put(4, map.getOrDefault(4, 0) + 1) = map.put(4, 1)
map = {0: 1, 1: 1, 2: 2, 3: 1, 4: 1}
The total number of nice subarrays with exactly 3 odd numbers is 2.
 */