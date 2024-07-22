package slidingWindow_And_2Pointers;

public class leetcode_424_longest_repeating_character_replacement {
    public static int characterReplacement(String s, int k) {
        int r=0;
        int l=0;
        int maxf=0;
        int maxl=0;
        int arr[] = new int [26];
        while(r<s.length()){
            char currentchar = s.charAt(r);
            arr[currentchar-'A']++;
            maxf=Math.max(maxf,arr[currentchar-'A']);
            if((r-l+1)-maxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxf<=k ){
                maxl=Math.max(maxl,r-l+1);
                r++;
            }
        }
        return maxl;
    }
    public static void main(String[] args) {
        String s= "ABAB";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }
}

// code with comment and explanation below including iterations.


/*
class Solution {
    public int characterReplacement(String s, int k) {
        // Initialize right and left pointers of the sliding window
        int r = 0;
        int l = 0;

        // maxf to keep track of the most frequent character in the current window
        int maxf = 0;

        // maxl to hold the length of the longest valid substring
        int maxl = 0;

        // Array to keep count of each character in the current window
        int[] arr = new int[26];

        // Iterate over the string
        while (r < s.length()) {
            // Get the current character
            char currentChar = s.charAt(r);

            // Increment the count of the current character
            arr[currentChar - 'A']++;

            // Update the maximum frequency of any character in the current window
            maxf = Math.max(maxf, arr[currentChar - 'A']);

            // Check if the window is valid
            if ((r - l + 1) - maxf > k) {
                // If the window is not valid, shrink the window from the left
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            // Update the length of the longest valid substring found
            if ((r - l + 1) - maxf <= k) {
                maxl = Math.max(maxl, r - l + 1);
                r++;
            }
        }
        // Return the length of the longest valid substring found
        return maxl;
    }
}




Example: s = "ABAB", k = 2
Let's go through the example step-by-step:

Initialization:

s = "ABAB"
r = 0, l = 0
maxf = 0
maxl = 0
arr = [0, 0, 0, 0, ..., 0] (26 zeros)
Iteration:

r = 0:

currentchar = 'A'
arr = [1, 0, 0, 0, ..., 0] (Increment count of 'A')
maxf = 1 (Maximum frequency is now 1)
(r - l + 1) - maxf = 1 - 1 = 0 (Window is valid)
maxl = 1 (Update max length to 1)
r = 1
r = 1:

currentchar = 'B'
arr = [1, 1, 0, 0, ..., 0] (Increment count of 'B')
maxf = 1 (Maximum frequency is still 1)
(r - l + 1) - maxf = 2 - 1 = 1 (Window is valid)
maxl = 2 (Update max length to 2)
r = 2
r = 2:

currentchar = 'A'
arr = [2, 1, 0, 0, ..., 0] (Increment count of 'A')
maxf = 2 (Maximum frequency is now 2)
(r - l + 1) - maxf = 3 - 2 = 1 (Window is valid)
maxl = 3 (Update max length to 3)
r = 3
r = 3:

currentchar = 'B'
arr = [2, 2, 0, 0, ..., 0] (Increment count of 'B')
maxf = 2 (Maximum frequency is still 2)
(r - l + 1) - maxf = 4 - 2 = 2 (Window is valid)
maxl = 4 (Update max length to 4)
r = 4
The loop ends since r has reached the end of the string.

The total length of the longest valid substring is 4.
*/