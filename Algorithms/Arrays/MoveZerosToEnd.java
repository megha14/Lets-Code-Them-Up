/**
 * MoveZerosToEnd.java
 * Purpose: Move zeros to end.
 *
 * @author Megha Rastogi
 * @version 1.0 07/13/2020
 */
class MoveZerosToEnd {

    /**
     * Move zeros to end of array
     *
     * @param Array, nums
     */
    public void moveZeroes(int[] nums) {
        
        // track index to keep track of non zero elements
        int index = 0;
        
        // Loop through the array and 
        // if element is not zero make it the
        // indexth element
 		    for(int arr_i = 0; arr_i < nums.length; arr_i++) {
 			    if(nums[arr_i] != 0){
 				    nums[index++] = nums[arr_i];
          }
        }
        
        // Loop from index to end to make the end elements zero
 		    for(int arr_i = index; arr_i < nums.length; arr_i++){
 			    nums[arr_i] = 0;
        }
    }
}
