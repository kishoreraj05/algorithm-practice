/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *
 */
package dp;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        int i = 0;
        while (i < nums.length){
            maxEndingHere = maxEndingHere + nums[i];
            if (maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0){
                maxEndingHere = 0;
            }
            i++;
        }
        return maxSoFar;
    }
}
