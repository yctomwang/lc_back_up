/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.60 %
    Runtime : 21 ms
    Memory Usage : 43.4 MB
    Testcase : 315 / 315 passed
    Ranking : 
        Your runtime beats 26.86 % of java submissions.
        Your memory usage beats 39.22 % of java submissions.
}
*/

class Solution {
    public int threeSumSmaller(int[] nums, int target) {
    //two pointer approach
    //then might cover binary search apporach later
    Arrays.sort(nums);
    if(nums.length<3){
        return 0;
    }
    int answer=0;
    for(int i=0; i<nums.length-2;i++){
        int leftpointer=i+1;
        int rightpointer=nums.length-1;
        int temptarget= target-nums[i];
        int tempsum=0;
        while(leftpointer<rightpointer){
            
            int current=nums[leftpointer]+nums[rightpointer];
            if(current<temptarget){
                answer+=rightpointer-leftpointer;
                leftpointer++;
                //tempsum+=rightpointer-leftpointer;
            }
            else{rightpointer--;
                }
          
    }}
        
        
    return answer;
    }
}