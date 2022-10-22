/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 68.27 %
    Runtime : 7 ms
    Memory Usage : 69.1 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 81.50 % of java submissions.
        Your memory usage beats 68.16 % of java submissions.
}
*/

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        //List<Integer> answer = new ArrayList<>();
        int[] answer2 = new int[nums.length];
        
        int currSum=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0) currSum+=nums[j];
        }
        
        for(int i=0;i<queries.length;i++){
            int previous = nums[queries[i][1]];
            nums[queries[i][1]]=nums[queries[i][1]]+queries[i][0];
            
            if(previous%2==0){
                currSum-=previous;
                
            }
            if(nums[queries[i][1]]%2==0){
                currSum+=nums[queries[i][1]];
            }
            answer2[i]=currSum;
            
        }
        
        return answer2;
        
    }
}