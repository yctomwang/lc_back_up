/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 51.65 %
    Runtime : 0 ms
    Memory Usage : 40.9 MB
    Testcase : 45 / 45 passed
    Ranking : 
        Your memory usage beats 49.63 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}