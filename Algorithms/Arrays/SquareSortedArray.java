/**
 * SquareSortedArray.java
 * Purpose: Squares of a Sorted Array
 *
 * @author Megha Rastogi
 * @version 1.0 08/09/2020
 */
class SquareSortedArray {
   /**
     * Find Squares of a Sorted Array
     *
     * @param Array, A
     * @return Array, A
     */
    public int[] sortedSquares(int[] A) {
    
        // loop through the array and replace each element
        // by it's square
        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
        
        // Sort the squared array
        Arrays.sort(A);
        
        // return the sorted array
        return A;
    }
}
