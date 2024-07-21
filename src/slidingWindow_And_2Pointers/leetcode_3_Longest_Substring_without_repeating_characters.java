package slidingWindow_And_2Pointers;
import java.util.HashMap;

public class leetcode_3_Longest_Substring_without_repeating_characters {
    static int lengthOfLongestSubstring(String s) {
        int r = 0;
        int l = 0;
        int maxlength = 0;
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        // if you dont under stand then see the explanation below .
        while (r < length) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            map.put(s.charAt(r), r);
            maxlength = Math.max(maxlength, r - l + 1);
            r++;
        }
        return maxlength;
    }
    public static void main(String[] args) {
         String s = "abacd";
        System.out.println(lengthOfLongestSubstring(s));

     }
}

//
//Explanation with an Example
//Consider the string s = "abba".
//
//        Initial Setup:
//
//r = 0, l = 0, maxlength = 0
//map = {} (empty map)
//Iteration 1 (r = 0):
//
//Current character: s[0] = 'a'
//map does not contain 'a'.
//Add 'a' to map: map = {'a': 0}
//Update maxlength: maxlength = max(0, 0 - 0 + 1) = 1
//Move r to the next character: r = 1
//Iteration 2 (r = 1):
//
//Current character: s[1] = 'b'
//map does not contain 'b'.
//Add 'b' to map: map = {'a': 0, 'b': 1}
//Update maxlength: maxlength = max(1, 1 - 0 + 1) = 2
//Move r to the next character: r = 2
//Iteration 3 (r = 2):
//
//Current character: s[2] = 'b'
//map contains 'b' at index 1.
//We need to update l to exclude the previous occurrence of 'b'.
//l = Math.max(map.get('b') + 1, l) = Math.max(1 + 1, 0) = 2
//        map.get('b') + 1 gives 2 (the position right after the last occurrence of 'b').
//l is updated to 2 to ensure it only moves forward.
//Update the position of 'b' in map: map = {'a': 0, 'b': 2}
//Update maxlength: maxlength = max(2, 2 - 2 + 1) = 2
//Move r to the next character: r = 3
//Iteration 4 (r = 3):
//
//Current character: s[3] = 'a'
//map contains 'a' at index 0.
//We need to update l to exclude the previous occurrence of 'a'.
//l = Math.max(map.get('a') + 1, l) = Math.max(0 + 1, 2) = 2
//        map.get('a') + 1 gives 1 (the position right after the last occurrence of 'a').
//l remains 2 because it's already greater than 1.
//Update the position of 'a' in map: map = {'a': 3, 'b': 2}
//Update maxlength: maxlength = max(2, 3 - 2 + 1) = 2
//Move r to the next character: r = 4 (end of string)
//Summary
//The key idea of l = Math.max(map.get(s.charAt(r)) + 1, l); is to ensure l only moves forward to maintain the validity of
// the substring s[l..r]. It does this by setting l to the position right after the last occurrence of the current character
// if that character has been seen before, but only if this new position is greater than the current value of l. This ensures
// that l never moves backward, maintaining the invariant and correctness of the sliding window.
//
