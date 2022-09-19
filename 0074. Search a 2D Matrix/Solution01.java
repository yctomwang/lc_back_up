/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 46.46 %
    Runtime : 0 ms
    Memory Usage : 42.7 MB
    Testcase : 133 / 133 passed
    Ranking : 
        Your memory usage beats 52.08 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    int[] convertCoord(int number, int m){
        int row= number/m;
        int col= number%m;
        return new int[]{row, col};
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // System.out.println(matrix[0].length);
        int m= matrix[0].length;//this is not the 
        int n= matrix.length;
        int totalLength=m*n;
        //we are searching for one occuranc
        // System.out.println("this is m:"+m);
        // System.out.println("this is n:"+n);
        //now we treat these two as if they were one thing
        
        int leftindex=0;
        int rightindex=m*n-1;
        while(leftindex<=rightindex){
            int mid= leftindex+(rightindex-leftindex)/2;
            int[] mid2= convertCoord(mid,m);
//                     System.out.println("this is c[0]:"+mid2[0]);
//                     System.out.println("this is c[1]:"+mid2[1]);
//             System.out.println("this is the value chosen"+matrix[mid2[0]][mid2[1]]);
            
            
            if(matrix[mid2[0]][mid2[1]]==target){
                return true;
            }
            else if(matrix[mid2[0]][mid2[1]]>target){
                rightindex=mid-1;
            }
            
            else{
                leftindex=mid+1;
            }
            
        }
        
        return false;
        
    }
}