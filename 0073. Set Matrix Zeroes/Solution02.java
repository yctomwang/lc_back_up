/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.94 %
    Runtime : 6 ms
    Memory Usage : 54 MB
    Testcase : 164 / 164 passed
    Ranking : 
        Your runtime beats 10.19 % of java submissions.
        Your memory usage beats 63.32 % of java submissions.
}
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        //any illegal inputs l
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                    
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row.contains(i)){
                    matrix[i][j]=0;
                }
                if(col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}