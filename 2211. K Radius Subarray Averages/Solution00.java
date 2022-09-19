/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 42.12 %
    Runtime : 16 ms
    Memory Usage : 166 MB
    Testcase : 39 / 39 passed
    Ranking : 
        Your runtime beats 66.67 % of java submissions.
        Your memory usage beats 45.33 % of java submissions.
}
*/

class Solution {
    public int[] getAverages(int[] nums, int k) {
    int[] ans = new int[nums.length];
    long tempSum=0;
    int left=0;
        
    if(k==0){
        for(int j=0;j<nums.length;j++){
            ans[j]=nums[j];
        }
        return ans;
    }
    for(int i=0;i<nums.length;i++){
        //into the window
        tempSum+=nums[i];
        //out of the window
        while((i-left+1)>2*k+1){
            tempSum-=nums[left];
            left++;
        }
        
        if((i-left+1)==2*k+1){
            long answer = Math.floorDiv(tempSum,(long)i-left+1);
            
            ans[i-k]=(int)answer;
            ans[i]=-1;
        }else{
             ans[i]=-1;
        }
    }
        
    
    //System.out.println(ans);
    return ans;
    }
}