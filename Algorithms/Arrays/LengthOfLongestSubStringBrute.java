/*
Time Complexity - O(n^3)
Space Complexity - O(n)
*/

class LengthOfLongestSubStringBrute {
    
    public int lengthOfLongestSubstring(String s) {
        
        //Initialize the length of result substring with zero
        int ans = 0;
        
        //Loop i from 0 to length of string and
        //loop j from i+1 to length of string 
        //to get each and every substring 
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                
                //Check if substring has all unique characters
                if(findIfUniqueSubstring(s, i, j)){
                    
                    //Update the result with the length of current substring
                    ans = Math.max(ans, j - i);
                }
            }
        }
        
        //return the answer
        return ans;
    }
    
    public boolean findIfUniqueSubstring(String s, int start, int end){
        
        //Initialize a HashSet to store the characters
        HashSet<Character> set = new HashSet<Character>();
        
        //Loop from starting index to ending index
        for(int i = start; i < end; i++){
            char c = s.charAt(i);
            
            //if the set contains present character then return false
            //else add the character to set.
            if(set.contains(c))
                return false;
            set.add(c);
        }
        
        //if all characters in substring are uniuq, return true;
        return true;
    }
}
