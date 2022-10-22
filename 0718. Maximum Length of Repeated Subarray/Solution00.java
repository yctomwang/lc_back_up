/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.59 %
    Runtime : 75 ms
    Memory Usage : 45 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 69.79 % of java submissions.
        Your memory usage beats 89.85 % of java submissions.
}
*/

class Solution {
   public int findLength(int[] A, int[] B) {
    int result = 0;
    for (int i = 0; i < A.length + B.length - 1; ++i) {
        // The current overlapping window is A[aStart, Math.min(A.length, B.length)] and B[bStart, Math.min(A.length, B.length)].
        int aStart = Math.max(0, A.length - 1 - i);  
        int bStart = Math.max(0, i - (A.length - 1));
        int numConsecutiveMatches = 0;
        for (int aIdx = aStart, bIdx = bStart; aIdx < A.length && bIdx < B.length; ++aIdx, ++bIdx) {
            // Maintain number of equal consecutive elements in the current window (overlap) and the max number ever computed.
            numConsecutiveMatches = A[aIdx] == B[bIdx] ? numConsecutiveMatches + 1 : 0;
            result = Math.max(result, numConsecutiveMatches);
        }
    }
    return result;
}
}