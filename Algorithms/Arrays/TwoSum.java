class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        //loop through the array
        for(int i = 0; i < nums.length; i++){
            
            //fix the first element in the pair
            int first = nums[i];
            
            //loop through remaining elements to find the second 
            // element of the pair
            for(int j = i+1; j < nums.length; j++){
                
                //return the indices of the pair
                if(first + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        
        //return empty array if not pair found
        return new int[]{};
    }
}
