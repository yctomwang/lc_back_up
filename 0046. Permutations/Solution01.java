/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 74.29 %
    Runtime : 3 ms
    Memory Usage : 45.2 MB
    Testcase : 26 / 26 passed
    Ranking : 
        Your runtime beats 48.08 % of java submissions.
        Your memory usage beats 18.72 % of java submissions.
}
*/

class Solution {
    //set a global variable
    List<List<Integer>> res = new LinkedList<>();
    
    public List<List<Integer>> permute(int[] nums) {
    LinkedList<Integer> track = new LinkedList<>();
    backtrack(nums,track);
        
    return res;
        
    }
    
    void backtrack(int[] nums, LinkedList<Integer> track){
        //base case return
        if(track.size()==nums.length){
            res.add(new LinkedList(track));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(track.contains(nums[i])){
                continue;
            }
            track.add(nums[i]);
            backtrack(nums,track);
            track.removeLast();
        }
        
    }
}