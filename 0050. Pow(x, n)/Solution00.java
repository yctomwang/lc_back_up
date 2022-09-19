/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 32.70 %
    Runtime : 2 ms
    Memory Usage : 42.9 MB
    Testcase : 305 / 305 passed
    Ranking : 
        Your runtime beats 17.21 % of java submissions.
        Your memory usage beats 50.64 % of java submissions.
}
*/

class Solution {
    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }
};