/**
 * FindNumbersWithEvenNumberOfDigits.java
 * Purpose: Find Numbers with Even Number of Digits
 *
 * @author Megha Rastogi
 * @version 1.0 08/09/2020
 */
class FindNumbersWithEvenNumberOfDigits {

    /**
     * Find Numbers with Even Number of Digits
     *
     * @param Array, nums
     * @return integer, numberOfEvenDigitNumbers
     */
    public int findNumbers(int[] nums) {
        
        // initialize the variable to store the count of
        // even digit numbers
        int numberOfEvenDigitNumbers = 0;
        
        // loop through the array and increase the counter
        // if number of digits are even
        for(int num: nums){
            if(numberOfDigits(num) % 2 == 0)
                numberOfEvenDigitNumbers++;
        }
        
        //return the result
        return numberOfEvenDigitNumbers;
    }
    
    /**
     * Find number of digits in an integer
     *
     * @param integer, num
     * @return integer, numberOfDigits
     */
    public int numberOfDigits(int num){
        
        // initialize the counter to store number of digits
        int numberOfDigits = 0;
        
        // loop until number is greater than 0
        // Continuously divide num by 10
        // increase the numberOfDigits by 1
        while(num > 0){
            num /= 10;
            numberOfDigits++;
        }
        
        // return  the result
        return numberOfDigits;
    }
}
