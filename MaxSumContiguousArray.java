/* Max Sum Contiguous Subarray */
/* Find the contiguous subarray within an array (containing at least
 * one number) which has the largest sum. 
 */

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int sumSoFar = A[0];
        int maxSum = sumSoFar;

        for (int i=1; i<A.length; i++) {
            sumSoFar = Math.max(A[i], sumSoFar + A[i]);   
            maxSum = Math.max(sumSoFar, maxSum);
        }

        return maxSum;
    }
}

