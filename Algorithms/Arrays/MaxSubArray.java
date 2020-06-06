/**
 * MaxSubArray.java
 * Purpose: Find maximum sum contiguous subarray 
 *
 * @author Megha Rastogi
 * @version 1.0 06/06/2020
 */
class MaxSubArray {
    
    /**
     * Find maximum sum contiguous subarray 
     *
     * @param Array, nums
     * @return integer, maxSum
     */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            if(sum < nums[i])
                sum = nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
