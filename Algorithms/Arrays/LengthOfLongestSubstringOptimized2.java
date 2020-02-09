/* 
Time Complexity - O(n)
Space Complexity - O(n)
*/

class LengthOfLongestSubstringOptimized2 {
    
    public int lengthOfLongestSubstring(String s) {
        
        //Initialize the length of result substring with zero
        int ans = 0, i = 0, j = 0;
        
        //Initialize a HashSet to store the characters
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        //Loop i from 0 to length of s and
        //loop j from 0 to length of s 
        //to get each and every substring 
        for(j = 0; j < s.length(); j++){
            
            //if map contains jth character
            if(map.containsKey(s.charAt(j))){
                //update i to the index of 
                i = Math.max(i, map.get(s.charAt(j)));
            }
            
            //put the character in map with index
            map.put(s.charAt(j), j+1);
            ans = Math.max(ans, j-i+1);
        }
        
        //return the answer
        return ans;
    }
        
        
}
