/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 53.15 %
    Runtime : 11 ms
    Memory Usage : 46.8 MB
    Testcase : 176 / 176 passed
    Ranking : 
        Your runtime beats 18.49 % of java submissions.
        Your memory usage beats 7.20 % of java submissions.
}
*/

class Solution {
    List<List<Integer>> answer = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int trackSum =0;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //cpmbination sum is just a subcase of combination lol
        
        Arrays.sort(candidates);
        
        backTrack(candidates,0,target);
        return answer;
        
    }
    
    public void backTrack(int[] candidates, int start, int target){
        
        if(trackSum==target){
            answer.add(new LinkedList(track));
        }
        
        if(trackSum>target){
            return;
        }
        for(int i=start; i< candidates.length; i++){
            
            if(i>start&&candidates[i]==candidates[i-1]){
                continue;
            }
            track.add(candidates[i]);
            trackSum+= candidates[i];
            //making a choice
            //after we have made a choice, then we cannot use the same element 
            //call backtrack
            backTrack(candidates, i+1, target);
            //undoing a choice 
            track.removeLast();
            trackSum-=candidates[i];
        }
    }
}