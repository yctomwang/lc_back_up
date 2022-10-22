/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.03 %
    Runtime : 1157 ms
    Memory Usage : 117.5 MB
    Testcase : 403 / 403 passed
    Ranking : 
        Your runtime beats 13.65 % of java submissions.
        Your memory usage beats 9.97 % of java submissions.
}
*/

class Solution {
    public int concatenatedBinary(int n) {
        final int MOD = 1000000007;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            for (int j = 0; j < binary.length(); j++) {
                result = (result * 2 + (binary.charAt(j) - '0')) % MOD;
            }
        }
        return result;
    }
}