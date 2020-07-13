/**
 * SingleNumber.java
 * Purpose: Find maximum sum contiguous subarray 
 *
 * @author Megha Rastogi
 * @version 1.0 07/13/2020
 */
class SingleNumber {

    /**
     * Find unique number in array of duplicates 
     *
     * @param Array, nums
     * @return integer, ans
     */
    public int singleNumber(int[] nums) {
       
        int ans = 0;
        
        // looping through the array and using XOR
        // as a ^ a is 0 and 0 ^ b is b
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
