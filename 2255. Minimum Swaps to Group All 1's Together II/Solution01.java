/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.69 %
    Runtime : 34 ms
    Memory Usage : 86.1 MB
    Testcase : 63 / 63 passed
    Ranking : 
        Your runtime beats 5.26 % of java submissions.
        Your memory usage beats 34.55 % of java submissions.
}
*/

class Solution {
    public int minSwaps(int[] nums) {
        //mod arithmatic 
        //or create a double lengh
        int count=0;
        for(int a=0;a<nums.length;a++){
            if(nums[a]==1)count++;
        }
        //123456
        int len=nums.length;
        int current=0;
        int global=0;
        int left=0;
        for(int i=0; i<2*nums.length;i++){
            int curr= nums[i%len];
            if(curr==1){
                current++;
            }
            while(i-left+1>count){
                int remove = nums[left%len];
                if(remove==1)current--;
                left++;
            }
            global=Math.max(current,global);
            
        }
        return count-global;
    }
}