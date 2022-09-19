/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 54.22 %
    Runtime : 4 ms
    Memory Usage : 81.7 MB
    Testcase : 60 / 60 passed
    Ranking : 
        Your runtime beats 85.56 % of java submissions.
        Your memory usage beats 11.90 % of java submissions.
}
*/

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        //start with two ends so we maximise the width regardless lol
        int left=0;
        int right=height.length-1;
        
        
        while(left<=right){
        int width = right - left;
        maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
        if(height[left]<=height[right]){
            left++;
        }
            
        else {
            right--;
        }
        }
        return maxarea;
    }
}