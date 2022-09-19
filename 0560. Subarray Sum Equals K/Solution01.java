/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.10 %
    Runtime : 45 ms
    Memory Usage : 66.3 MB
    Testcase : 92 / 92 passed
    Ranking : 
        Your runtime beats 55.91 % of java submissions.
        Your memory usage beats 69.33 % of java submissions.
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