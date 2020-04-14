class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        
        // Initialize leftshifts, rightshifts and totalshifts
        int left = 0, right = 0, total = 0;
        
        // Loop through the shift matrix
        for(int i = 0; i < shift.length; i++){
            
            // Add total amount to left and right shifts needed
            // 0 for left, 1 for right
            if(shift[i][0] == 0)
                left+= shift[i][1];
            else
                right+=shift[i][1];
        }
        
        // find the total number of shifts needed.
        total = left - right;

        // return string after shifting the required amount
        return performShift(s, total);
    }
    
    public String performShift(String s, int total){
        
        //Initialize a new StringBuilder and length
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        
        // If total = 0, no shifts needed
        // total % len, incase total > len
        if(total % len == 0)
            return s;
        
        // else if total > 0, left shift
        if(total > 0){
            
            // Find the substring from 0 to total % len
            String sub = s.substring(0, total % len);
            
            // delete that substring
            sb.delete(0, total % len);
            
            // append the substring to end of string
            sb.append(sub);
        }else{
            
            // Find the substring from len + total % len to len
            String sub = s.substring(len + total % len,len);
            
            // delete that substring
            sb.delete(len + total % len,len);
            
            // insert the substring to start of string
            sb.insert(0, sub);
        }
        
        // return the result string
        return sb.toString();
    }
}
