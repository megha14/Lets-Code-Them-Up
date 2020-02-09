class LengthOfLongestSubstringOptimized {
    
    public int lengthOfLongestSubstring(String s) {
        
        //Initialize the length of result substring with zero
        int ans = 0, i = 0, j = 0;
        
        //Initialize a HashSet to store the characters
        HashSet<Character> set = new HashSet<Character>();
        
        //Loop i from 0 to length of s and
        //loop j from 0 to length of s 
        //to get each and every substring 
        while(i < s.length() && j < s.length()){
            
            //if character at jth position is not present in set
            if(!set.contains(s.charAt(j))){
                
                //add the character to the set and set result 
                //to length of substring till now.
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else{
                //remove the character at ith position and increment i;
                set.remove(s.charAt(i++));
            }
        }
        //return the answer
        return ans;
    }
        
        
}
