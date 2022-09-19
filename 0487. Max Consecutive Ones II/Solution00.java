/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.20 %
    Runtime : 5 ms
    Memory Usage : 56.3 MB
    Testcase : 43 / 43 passed
    Ranking : 
        Your runtime beats 40.59 % of java submissions.
        Your memory usage beats 76.30 % of java submissions.
}
*/

//Follow up infinite stream - Maintain the 'left', 'right' and 'last seen zero'. As soon as one encounters another 0 in stream, record the maxLength; make leftIndex = zeroIndex + 1, and set zeroIndex = right = curIndex. Again continue processing the stream.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    
    int zeroCount =0;
    int maxLen=0;   
    int left=0;
    for(int i=0;i<nums.length;i++){
        int curr = nums[i];
        if(curr==0){
            zeroCount++;
        }
        
        while(zeroCount>1){
            int currLeft=nums[left];
            if(currLeft==0){
                zeroCount--;
            }
            left++;
        }
        maxLen=Math.max(maxLen,i-left+1);
               
        
    }
    return maxLen;
    
    
    }
}