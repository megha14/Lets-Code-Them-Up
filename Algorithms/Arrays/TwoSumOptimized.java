class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Hashmap to store the nums[i] and i, where 0<i<nums.length
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        //loop through the array
        for(int num = 0; num < nums.length; num++){
            
            //find difference between target and nums[num]
            int compliment = target - nums[num];
            
            //if map contains the compliment then we have the result indices of num and map.get(compliment)
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), num};
            }
            
            //put nums[num] and num in map as key, value pair
            map.put(nums[num], num);
        }
        
        //return empty array if no pair found
        return new int[]{};
    }
}
