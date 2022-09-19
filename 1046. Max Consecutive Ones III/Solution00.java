/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.53 %
    Runtime : 3 ms
    Memory Usage : 71.2 MB
    Testcase : 52 / 52 passed
    Ranking : 
        Your runtime beats 93.94 % of java submissions.
        Your memory usage beats 41.20 % of java submissions.
}
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        //å¥å¨é¢
        //è¿åªè¦éé¢ç0æ²¡æè¶è¿ï¼substring - ï¼1çä¸ªæ°ï¼
        //åº0å¤ªå¤äº
        //ç® è¿ä¸ªé¨åæ²¡å¥
        //4åéAC
        int maxlen=0;
        int left=0;
        //how many 1s we have in current sliding window
        int oneCount=0;
        for(int i=0; i<nums.length;i++){
            int curr= nums[i];
            if(curr==1){
                oneCount++;
            }
            while((i-left+1)-oneCount>k){
                if(nums[left]==1){
                    oneCount--;
                }
                left++;
            }
            
            
            //calculate
            maxlen=Math.max(i-left+1,maxlen);
        }
        
        return maxlen;
        
    }
}