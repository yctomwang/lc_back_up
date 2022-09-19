/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 67.23 %
    Runtime : 19 ms
    Memory Usage : 51.1 MB
    Testcase : 171 / 171 passed
    Ranking : 
        Your runtime beats 8.38 % of java submissions.
        Your memory usage beats 7.39 % of java submissions.
}
*/

class Solution {
    List<List<Integer>> answer = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    
    int trackSum=0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
       
     
        backTrack(candidates,0, target);
        
        
        
        return answer;
        
    }
    
    public void backTrack(int[] candidates, int start, int target){
        //termination conditon
        if(trackSum==target){
            answer.add(new LinkedList(track));
        }
        if(trackSum>target){
            return;
        }
        
        for(int i = start; i<candidates.length;i++){
            //making the choice
            track.add(candidates[i]);
            trackSum+= candidates[i];
            
            //call backtrack
            backTrack(candidates, i, target);
            
            //undoing the choice 
            track.removeLast();
            trackSum-= candidates[i];
            
        }
        
    }
}