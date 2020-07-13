/**
 * HappyNumber.java
 * Purpose: Determine if a number is happy
 *
 * @author Megha Rastogi
 * @version 1.0 07/13/2020
 */
class HappyNumber {

    // Set to track the sum of squares encountered till now
    HashSet<Integer> cache = new HashSet<Integer>();
    
    /**
     * Determine if a number is happy
     *
     * @param integer, n
     * @return boolean, ans
     */
    public boolean isHappy(int n) {
    
        // find sum of squares of digits
        int sum = findSum(n);
        
        // if sum is 1, we found a happy number
        // return true
        if(sum == 1)
            return true;
            
        // if sum is already present in the cache
        // number is not happy, return false
        if(cache.contains(sum))
            return false;
            
        // add sum to cache
        cache.add(sum);
        
        // Find if the new number is happy or not
        return isHappy(sum);
    }
    
    /**
     * Determine sum of squares of each
     * digit in number
     *
     * @param integer, n
     * @return integer, sum
     */
    public int findSum(int n){
        
        // variable to keep track of sum
        int sum = 0;
        
        // Find each digit of the number and
        // add square of that digit to sum
        while(n > 0){
        
            // determine remainder, last digit
            int rem = n % 10;
            
            // add sqaure of remainder to sum
            sum += (rem * rem);
            
            // divide number by 10 to loose the last digit
            n = n/10;
        }
        
        // return sum of squares of each digit
        return sum;
    }
}
