/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 88.01 %
    Runtime : 0 ms
    Memory Usage : 41.1 MB
    Testcase : 150 / 150 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        return 2*n;
    }
}