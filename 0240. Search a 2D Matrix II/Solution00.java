/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.37 %
    Runtime : 20 ms
    Memory Usage : 57.8 MB
    Testcase : 129 / 129 passed
    Ranking : 
        Your runtime beats 12.43 % of java submissions.
        Your memory usage beats 44.63 % of java submissions.
}
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}