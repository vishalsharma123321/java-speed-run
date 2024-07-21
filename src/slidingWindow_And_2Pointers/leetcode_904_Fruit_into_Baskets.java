package slidingWindow_And_2Pointers;

import java.util.HashMap;

public class leetcode_904_Fruit_into_Baskets {

    public static int totalFruit(int[] fruits) {
        int r = 0; // Right pointer for the sliding window
        int l = 0; // Left pointer for the sliding window
        int maxlength = 0; // Variable to keep track of the maximum length of the subarray
        HashMap<Integer, Integer> map = new HashMap<>(); // Map to store the count of each type of fruit in the current window

        while (r < fruits.length) { // Iterate through the array with the right pointer
            // Add the current fruit to the map and update its count
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            // If the map size exceeds 2, it means we have more than 2 types of fruits
            if (map.size() > 2) {
                // Reduce the count of the fruit at the left pointer
                map.put(fruits[l], map.get(fruits[l]) - 1);
                // If the count of the fruit at the left pointer becomes 0, remove it from the map
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                // Move the left pointer to the right to reduce the window size
                l++;
            }
            // If the map size is 2 or less, update the maximum length of the subarray
            if (map.size() <= 2) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
            // Move the right pointer to the right to expand the window
            r++;
        }
        // Return the maximum length of the subarray found
        return maxlength;
    }
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(totalFruit(fruits)); // Should print 4
    }
}
