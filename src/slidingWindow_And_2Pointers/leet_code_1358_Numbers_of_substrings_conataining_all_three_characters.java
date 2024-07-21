package slidingWindow_And_2Pointers;

public class leet_code_1358_Numbers_of_substrings_conataining_all_three_characters {
    public static int numberOfSubstrings(String s) {
        // Array to store the latest positions of characters 'a', 'b', and 'c'
        int[] latestPosition = new int[] {-1, -1, -1};

        // This will hold the count of valid substrings
        int answer = 0;

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);

            // Update the latest position of the current character
            latestPosition[currentChar - 'a'] = i;

            // Find the smallest index among the latest positions of 'a', 'b', and 'c'
            // and add 1 to get the count of valid substrings ending with the current character
            int minPosition = Math.min(latestPosition[0], Math.min(latestPosition[1], latestPosition[2]));
            answer += minPosition + 1;
        }

        return answer; // Return the total count of valid substrings
    }

    public static void main(String[] args) {
        String s1 = "abcabc";
        System.out.println(numberOfSubstrings(s1));
    }
}






// optimized code for its explanation scrool down.

// class Solution {
// public int numberOfSubstrings(String s) {
// // Array to store the latest positions of characters 'a', 'b', and 'c'
// int[] latestPosition = new int[] {-1, -1, -1};

// // This will hold the count of valid substrings
// int answer = 0;

// // Iterate over each character in the string
// for (int i = 0; i < s.length(); ++i) {
// char currentChar = s.charAt(i);

// // Update the latest position of the current character
// latestPosition[currentChar - 'a'] = i;

// // Find the smallest index among the latest positions of 'a', 'b', and 'c'
// // and add 1 to get the count of valid substrings ending with the current
// character
// int minPosition = Math.min(latestPosition[0], Math.min(latestPosition[1],
// latestPosition[2]));
// answer += minPosition + 1;
// }

// return answer; // Return the total count of valid substrings
// }
// }

// the iteration
/*
 * Example: s = "abcabc"
 * Let's go through the example step-by-step:
 *
 * Initialization:
 *
 * s = "abcabc"
 * latestPosition = [-1, -1, -1]
 * answer = 0
 * Iteration:
 *
 * i = 0:
 *
 * currentChar = 'a'
 * latestPosition = [0, -1, -1] (Update position of 'a')
 * minPosition = -1 (Minimum of [0, -1, -1])
 * answer += (-1 + 1) = 0 (No valid substrings yet)
 * i = 1:
 *
 * currentChar = 'b'
 * latestPosition = [0, 1, -1] (Update position of 'b')
 * minPosition = -1 (Minimum of [0, 1, -1])
 * answer += (-1 + 1) = 0 (No valid substrings yet)
 * i = 2:
 *
 * currentChar = 'c'
 * latestPosition = [0, 1, 2] (Update position of 'c')
 * minPosition = 0 (Minimum of [0, 1, 2])
 * answer += (0 + 1) = 1 (One valid substring: "abc")
 * i = 3:
 *
 * currentChar = 'a'
 * latestPosition = [3, 1, 2] (Update position of 'a')
 * minPosition = 1 (Minimum of [3, 1, 2])
 * answer += (1 + 1) = 2 (Two valid substrings: "bca", "abca")
 * i = 4:
 *
 * currentChar = 'b'
 * latestPosition = [3, 4, 2] (Update position of 'b')
 * minPosition = 2 (Minimum of [3, 4, 2])
 * answer += (2 + 1) = 3 (Three valid substrings: "cab", "bcab", "abcab")
 * i = 5:
 *
 * currentChar = 'c'
 * latestPosition = [3, 4, 5] (Update position of 'c')
 * minPosition = 3 (Minimum of [3, 4, 5])
 * answer += (3 + 1) = 4 (Four valid substrings: "abca", "cabca", "bcabca",
 * "abcabc")
 * The total count of valid substrings containing 'a', 'b', and 'c' is 1 + 2 + 3
 * + 4 = 10.
 */

// class Solution {
// public int numberOfSubstrings(String s) {
// int r=0;
// int l=0;
// int result=0;
// int arr[] = new int [3];
// int n=s.length();
// while(r<n){ // abcabc //[a-a = 0]++ = [1,0,0] [b-a = 1]++ = [1,1,0] [c-a =
// 0]++ = [1,1,1]
// arr[s.charAt(r)-'a']++; //[1,0,0]

// while(arr[0]>0 && arr[1]>0 && arr[2]>0){ // f f t
// result+=n-r; // 6-2 = 4
// arr[s.charAt(l)-'a']--; // [a-a=0]--= we had 1 at 0th postion so it becoms
// 1-- = 0
// l++;
// }
// r++;
// }
// return result;
// }
// }