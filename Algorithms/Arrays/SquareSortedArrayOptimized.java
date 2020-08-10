/**
 * SquareSortedArrayOptimized.java
 * Purpose: Squares of a Sorted Array
 *
 * @author Megha Rastogi
 * @version 1.0 08/09/2020
 */
class SquareSortedArrayOptimized {
   /**
     * Find Squares of a Sorted Array
     *
     * @param Array, A
     * @return Array, ans
     */
    public int[] sortedSquares(int[] A) {
    
        // return null if array is null
        if (A == null) return null;
        
        // initialize the result array
        int [] ans = new int[A.length];
     
        // initialize start and end pointers to start and end index of array
        int start = 0, end = A.length - 1;
       
        int i = end; // insert position.
       
        // Loop until start is less than equal to end
        while (start <= end) { 
            
            // finding square of start and end element
            int pow1 = A[start] * A[start];
            int pow2 = A[end] * A[end];
           
            // if power of start is bigger, 
            // ith element must be start element
            // increment start as we placed first negative number
            // else ith element will be end element
            if (pow1 > pow2) {
                ans[i--] = pow1;
                start++;
            } else {
                ans[i--] = pow2;
                end--;
            }
        }
       
        // return the result array
        return ans;
    }
}
