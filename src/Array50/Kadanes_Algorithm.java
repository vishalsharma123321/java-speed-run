package Array50;

// this used to find the maximum sum of sub array in an array.
/*
example
Input: arr = {-2,-3,4,-1,-2,1,5,-3}
Output: 7
Explanation: The subarray {4,-1, -2, 1, 5} has the largest sum 7.

Input: arr = {2}
Output: 2
Explanation: The subarray {2} has the largest sum 2.

Input: arr = {5,4,1,7,8}
Output: 25
Explanation: The subarray {5,4,1,7,8} has the largest sum 25.
 */
public class Kadanes_Algorithm {
    static int solution(int nums[]){
        int maxsum=0;
        int sum=0;
        int l=0;
        for (int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
            if(sum<0 && l<=i){
                sum=0;
                l++;
            }
        }
            return maxsum;
    }
    public static void main(String[] args) {
//        int nums[] = {1,2,3,-2,5};
          int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(solution(nums));
    }
}
