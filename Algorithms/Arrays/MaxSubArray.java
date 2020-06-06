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
        
        // Initalize maxSum and sum
        int maxSum = Integer.MIN_VALUE, sum = 0;
        
        // Loop through the array
        for(int i = 0; i < nums.length; i++){
            
            // add current value to sum
            sum+=nums[i];
            
            // update sum if it becomes less than current value
            if(sum < nums[i])
                sum = nums[i];
            
            // update the max sum
            maxSum = Math.max(maxSum, sum);
        }
        
        //return the max sum
        return maxSum;
    }
}
