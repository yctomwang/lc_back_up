/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.00 %
    Runtime : 763 ms
    Memory Usage : 158.4 MB
    Testcase : 72 / 72 passed
    Ranking : 
        Your runtime beats 13.88 % of java submissions.
        Your memory usage beats 13.42 % of java submissions.
}
*/

class Solution {
    public int longestConsecutive(int[] nums) {
    //boolean array of the length will exceed memory
    //but put everything in that boolean array
    //loop through the whole boolean array
    //this should be O(n) but space is too big
    
    //boolean[] arr = new boolean[2000000000];

    Set<Integer> set = new HashSet<Integer>();
    
        
    for(int num:nums){
        set.add(num);
    }
    int longest=0; 
    for(int i=0; i<nums.length;i++){
        if(!set.contains(nums[i]-1)&&set.contains(nums[i])){
            int currentNum = nums[i];
            int currentStreak = 1;

            while (set.contains(currentNum+1)) {
                currentNum += 1;
                currentStreak += 1;
            }
            longest=Math.max(longest,currentStreak);
        }
    }
    
        
    return longest;
    }
}