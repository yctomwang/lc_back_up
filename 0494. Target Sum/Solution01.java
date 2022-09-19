/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.49 %
    Runtime : 474 ms
    Memory Usage : 71.3 MB
    Testcase : 139 / 139 passed
    Ranking : 
        Your runtime beats 36.43 % of java submissions.
        Your memory usage beats 9.78 % of java submissions.
}
*/

class Solution {
    Map<String, Integer> cache = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(target,nums,0,0);
    }
    
    //bottom up dfs
    public int dfs(int target, int[] nums, int sum, int currDepth){
        String key= currDepth+"|"+sum;
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        if(currDepth==nums.length){
            cache.put(key,sum==target?1:0);
            return cache.get(key);
            
        }
        int optOne=dfs(target,nums,sum+nums[currDepth],currDepth+1);
        
        int optTwo=dfs(target,nums,sum-nums[currDepth],currDepth+1);
        
        cache.put(key,optOne+optTwo);
        return optOne+optTwo;
    }
}