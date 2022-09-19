/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 54.06 %
    Runtime : 80 ms
    Memory Usage : 71.6 MB
    Testcase : 55 / 55 passed
    Ranking : 
        Your runtime beats 56.87 % of java submissions.
        Your memory usage beats 46.29 % of java submissions.
}
*/

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    
    private int atMostK(int[] nums, int k){
        int answer=0;
        int left=0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.getOrDefault(nums[i],0)==0) k--;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(k<0){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)k++;
                left++;
            }
            answer+=i-left+1;
        }
        return answer;
    }
}