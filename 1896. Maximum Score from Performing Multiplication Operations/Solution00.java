/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 35.88 %
    Runtime : 78 ms
    Memory Usage : 102.9 MB
    Testcase : 50 / 50 passed
    Ranking : 
        Your runtime beats 72.19 % of java submissions.
        Your memory usage beats 57.12 % of java submissions.
}
*/

class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        // For Right Pointer
        int n = nums.length;
        // Number of Operations
        int m = multipliers.length;
        int[][] dp = new int[m + 1][m + 1];
        
        for (int i = 0; i <= m; i++)
            Arrays.fill(dp[i], 0);
        
        for (int op = m - 1; op >= 0; op--) {
            for (int left = op; left >= 0; left--) {
                dp[op][left] = Math.max(multipliers[op] * nums[left] + dp[op + 1][left + 1],
                                   multipliers[op] * nums[n - 1 - (op - left)] + dp[op + 1][left]);
            }
        }
        
        return dp[0][0];
    }
}