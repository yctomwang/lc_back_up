/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 54.22 %
    Runtime : 7 ms
    Memory Usage : 72.1 MB
    Testcase : 60 / 60 passed
    Ranking : 
        Your runtime beats 28.82 % of java submissions.
        Your memory usage beats 76.96 % of java submissions.
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
            
        else if(height[right]<height[left]) {
            right--;
        }
        }
        return maxarea;
    }
}