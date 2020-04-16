class CheckValidString {
    public boolean checkValidString(String s) {
        
        // Initialize minimum and maximum number of open brackets to 0
        int minOpen = 0, maxOpen = 0;
        
        // Loop through each character of string
        for(char ch: s.toCharArray()){
            
            // If we encounter '(' then increase minOpen by 1
            // else we encounter ')' so decrease minOpen by 1
            minOpen = (ch == '(') ? minOpen+1 : minOpen-1;
            
            // If we encounter '(' or '*' then increase maxOpen by 1
            // else we encounter ')' so decrease maxOpen by 1
            maxOpen = (ch != ')') ? maxOpen+1 : maxOpen-1;
            
            // if maxOpen is less than zero, means an imbalance of '(' and ')'
            // return false
            if(maxOpen < 0)
                return false;
            
            // make minOpen zero if it is negative
            minOpen = Math.max(0, minOpen);
        }
        
        // return true if minOpen == 0 else false
        return (minOpen == 0);
    }
}
