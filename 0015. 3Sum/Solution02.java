/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 32.05 %
    Runtime : 25 ms
    Memory Usage : 46.2 MB
    Testcase : 311 / 311 passed
    Ranking : 
        Your runtime beats 91.64 % of java submissions.
        Your memory usage beats 98.26 % of java submissions.
}
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer= new ArrayList();
        //use this inbuilt sort lol
        Arrays.sort(nums);
        
        //fix one index and loop the rest
        for(int i=0;i<nums.length-2;i++){
            //duplicate check
            if(i==0||nums[i]!=nums[i-1]){
                //deal with the two sum shit right here
                
                int leftindex= i+1;
                int rightindex=nums.length-1;
                int target=0-nums[i];
                //start the 2 pointer
                while(leftindex<rightindex){
                    if(nums[leftindex]+nums[rightindex]==target){
                                    answer.add(Arrays.asList(nums[i],nums[leftindex],nums[rightindex]));
                    while(leftindex<rightindex&&nums[leftindex]==nums[leftindex+1]){
                        leftindex++;
                        
                    }
                        
                    while(leftindex<rightindex&&nums[rightindex]==nums[rightindex-1]){
                        rightindex--;
                    }
                        leftindex++;
                        rightindex--;
                    }
                    else if(nums[leftindex]+nums[rightindex]<target){
                        leftindex++;
                    }
                    else{
                        rightindex--;
                    }
                    
                    
                }
            }
        }
        
        
        return answer;
        
    }
}