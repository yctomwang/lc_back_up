/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 63.61 %
    Runtime : 10 ms
    Memory Usage : 43 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 51.92 % of java submissions.
        Your memory usage beats 88.86 % of java submissions.
}
*/

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer= new int[queries.length];
        //sort the thing
        //then for loop through queries
        
        Arrays.sort(nums);
        //System.out.println(nums[1]);
        for(int i=0;i<queries.length;i++){
            int target=queries[i];
            int flag=0;
            for(int j=0;j<nums.length;j++){
                target-=nums[j];
                if(target<0){
                   flag=j-1;
                    break;
                }
                if(j==nums.length-1&&target>=0){
                    flag=j;
                }
                else{flag=j-1;}
                
            }
            if(flag==-1){
                answer[i]=0;
            }
            else{
                answer[i]=flag+1;
            }
            
            
        }
        return answer;
    }
}