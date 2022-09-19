/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 67.23 %
    Runtime : 6 ms
    Memory Usage : 46 MB
    Testcase : 160 / 160 passed
    Ranking : 
        Your runtime beats 60.93 % of java submissions.
        Your memory usage beats 23.92 % of java submissions.
}
*/

class Solution {
    List<List<Integer>> answer = new LinkedList<>();
    
    public List<List<Integer>> combinationSum(int[] candi, int target) {
    //221
    //
    Arrays.sort(candi);
    backTrack(candi,-1,0,target,new LinkedList<>());
    return answer;
    }
    
    
    public void backTrack(int[] candi, int last,int currSum, int target, List<Integer> sumSoFar){
        if(currSum==target){
            //add into answer
            answer.add(new LinkedList<>(sumSoFar));
            return;
        }
        if(currSum>target){
            return;
        }
        
        for(int i=last+1;i<candi.length;i++){
            if(currSum+candi[i]<=target){
                sumSoFar.add(candi[i]);
                if(i==last+1){
                    backTrack(candi,last,currSum+candi[i],target,sumSoFar);
                }else{
                    //System.out.println(i);
                    backTrack(candi,i-1,currSum+candi[i],target,sumSoFar);
                }
                
                sumSoFar.remove(sumSoFar.size()-1);
            }
        }
    }
}