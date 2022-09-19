/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 36.42 %
    Runtime : 28 ms
    Memory Usage : 71.5 MB
    Testcase : 173 / 173 passed
    Ranking : 
        Your runtime beats 20.57 % of java submissions.
        Your memory usage beats 56.40 % of java submissions.
}
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        int answer=1;
        //hash set to store everything in nums
        //for loop to check starting from 1 to 10000, first non existing is our answer;
        //O(n) space
        //O(n) time
        Set<Integer> ansSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            // if(nums[i]>0){
                ansSet.add(nums[i]);
            // }
        }
        //1000,10000,1110
        
        for(int i=1;i<ansSet.size();i++){
            if(!ansSet.contains(i)){
                break;
            }
            if(ansSet.contains(i)){
                answer+=1;
            }
        }
        if(ansSet.contains(answer)){
            return answer+1;
        }
        
        return answer;
    }
}