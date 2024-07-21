package slidingWindow_And_2Pointers;
import java.util.HashMap;

public class leetcode_159_Longest_Substring_with_At_Most_K_Distinct_Characters {
    public static int solution(String s, int k) {
        int r = 0; // Right pointer for the sliding window
        int l = 0; // Left pointer for the sliding window
        int maxlength = 0; // Variable to keep track of the maximum length of the subarray
        HashMap<Character, Integer> map = new HashMap<>(); // Map to store the count of each character in the current window

        while (r < s.length()) { // Iterate through the string with the right pointer
            // Add the current character to the map and update its count
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            // If the map size exceeds k, it means we have more than k distinct characters
            if (map.size() > k) {
                // Reduce the count of the character at the left pointer
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                // If the count of the character at the left pointer becomes 0, remove it from the map
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                //Move the left pointer to the right to reduce the window size
                l++;
            }
            // If the map size is k or less, update the maximum length of the subarray
            if (map.size() <= k) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
            // Move the right pointer to the right to expand the window
            r++;
        }
        // Return the maximum length of the subarray found
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "aaabbcccc";
        int k = 2;
        System.out.println(solution(s, k)); // Should print 6
    }
}




/* Explanation:
1. The sliding window is managed using two pointers, `l` (left) and `r` (right).
2. The `map` keeps track of the count of each character in the current window.
3. As the right pointer `r` moves through the string, we add the current character to the map and update its count.
4. If the map size exceeds `k` (meaning more than `k` distinct characters in the window), we need to shrink the window from the left:
   - Reduce the count of the character at the left pointer `l`.
   - If the count of that character becomes 0, remove it from the map.
   - Move the left pointer `l` to the right to reduce the window size.
5. After adjusting the window, if the map size is `k` or less, update the maximum length of the valid subarray.
6. Continue this process until the right pointer `r` has traversed the entire string.
7. The result is the maximum length of a subarray with at most `k` distinct characters.
*/

/* Time Complexity:
- The time complexity is O(n), where n is the length of the string `s`.
- Each character in the string is processed at most twice (once by the right pointer and once by the left pointer).
- Insertion and deletion operations on the HashMap are O(1) on average.

Space Complexity:
- The space complexity is O(k), where k is the number of distinct characters allowed in the window.
- In the worst case, the HashMap stores up to `k` distinct characters and their counts.
- Thus, the space used by the map is proportional to the number of distinct characters, which is at most `k`.
*/
