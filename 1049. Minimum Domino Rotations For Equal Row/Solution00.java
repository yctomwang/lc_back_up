/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.45 %
    Runtime : 7 ms
    Memory Usage : 88.1 MB
    Testcase : 84 / 84 passed
    Ranking : 
        Your runtime beats 57.24 % of java submissions.
        Your memory usage beats 84.48 % of java submissions.
}
*/

class Solution {
      public int minDominoRotations(int[] A, int[] B) {
        int[] countA = new int[7], countB = new int[7], same = new int[7];
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            countA[A[i]]++;
            countB[B[i]]++;
            if (A[i] == B[i])
                same[A[i]]++;
        }
        for (int i  = 1; i < 7; ++i)
            if (countA[i] + countB[i] - same[i] == n)
                return n - Math.max(countA[i], countB[i]);
        return -1;
    }
}