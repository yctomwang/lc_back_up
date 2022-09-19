/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 73.40 %
    Runtime : 3 ms
    Memory Usage : 43.6 MB
    Testcase : 10 / 10 passed
    Ranking : 
        Your runtime beats 9.90 % of java submissions.
        Your memory usage beats 33.31 % of java submissions.
}
*/

class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        //List<List<Integer>> res = new LinkedList<>();
        backtrack(nums,0);
        
        return res;
        
        
    }
    
    public void backtrack(int[]nums, int current){
        //condition check
        res.add(new LinkedList(track));
        
        for(int i=current;i<nums.length;i++){
            //make a choice
            track.add(nums[i]);
            backtrack(nums,i+1);
            track.removeLast();
                
            
        }
        
        
        
    }
}