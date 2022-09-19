/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 54.93 %
    Runtime : 3 ms
    Memory Usage : 44.5 MB
    Testcase : 20 / 20 passed
    Ranking : 
        Your runtime beats 49.67 % of java submissions.
        Your memory usage beats 24.90 % of java submissions.
}
*/

class Solution {
    LinkedList<Integer> track = new LinkedList<>();
    List<List<Integer>> answer = new LinkedList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //
        //
        Arrays.sort(nums);
        backtrack(0,nums);
        
        return answer;
        
    }
    
    public void backtrack(int start, int[]nums){
        answer.add(new LinkedList(track));
        
        for(int i=start; i<nums.length;i++){
            //make a choice 
            if(i>start&&nums[i]==nums[i-1]){
                continue;
            }
            
            
            track.add(nums[i]); 
            //call backtrack
            backtrack(i+1, nums);
            //undo the choice ;) 
            track.removeLast();
            
        }
        
        
        
        
        
    }
}