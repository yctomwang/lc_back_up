/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.10 %
    Runtime : 36 ms
    Memory Usage : 67.1 MB
    Testcase : 92 / 92 passed
    Ranking : 
        Your runtime beats 75.30 % of java submissions.
        Your memory usage beats 59.82 % of java submissions.
}
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer=0;
        Map<Integer, Integer>  prefix = new HashMap<>();
        int sum=0;
        prefix.put(0,1);
        for(int i =0; i<nums.length;i++){
            sum=sum+nums[i];
            int difference = sum-k;
            answer+=prefix.getOrDefault(difference,0);
            prefix.put(sum,prefix.getOrDefault(sum,0)+1);
        }
        return answer;
    }
}