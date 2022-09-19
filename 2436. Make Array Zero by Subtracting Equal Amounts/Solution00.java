/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.16 %
    Runtime : 13 ms
    Memory Usage : 42.2 MB
    Testcase : 95 / 95 passed
    Ranking : 
        Your runtime beats 5.63 % of java submissions.
        Your memory usage beats 27.21 % of java submissions.
}
*/

class Solution {
    public int minimumOperations(int[] nums) {
        //int min=Integer.MAX_VALUE;
        int count=0;
        int flag=0;
        while(flag!=1){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min&&nums[i]!=0) min=nums[i];
            }
            if(min==Integer.MAX_VALUE){
                flag=1;
            }
             for(int i=0;i<nums.length;i++){
                if(nums[i]!=0) nums[i]-=min;
                
            }
             count++;
        //if(min==Integer.MAX_VALUE) return 0;
        }
        System.out.println("this is count"+count);
        //System.out.println(min);
        
        return count-1;
        
    }
}