/**
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 * Example 1:
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 *
 * Example 2:
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 */
package dp;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int maxLen = 0;
        int dp[] = new int[nums.length];
        int j = 0;
        while (j < nums.length){
            int i = 0;
            int prevMax = 0;
            while (i<j){
                if (nums[i] < nums[j] && dp[i] > prevMax){
                    prevMax = dp[i];
                }
                i++;
            }
            dp[j] = prevMax + 1;
            if (maxLen < dp[j]){
                maxLen = dp[j];
            }
            j++;
        }
        return maxLen;
    }
}
