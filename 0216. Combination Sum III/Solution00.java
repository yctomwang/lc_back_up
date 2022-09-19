/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 66.88 %
    Runtime : 0 ms
    Memory Usage : 39.7 MB
    Testcase : 18 / 18 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 96.95 % of java submissions.
}
*/

class Solution {
    
    
    List<List<Integer>> answer =  new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int trackSum =0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(1,n,0,k);
        return answer;
    }
    
    public void backTrack(int start, int n, int layer,int k){
        //termination condtion
        if(layer==k&&trackSum==n){
            //we add into it
            answer.add(new LinkedList(track));
        }
        if(layer>k){
            return;
        }
        if(trackSum>n){
            return;
        }
        for (int i=start;i<10;i++){
            track.add(i);
            trackSum+=i;
            
            backTrack(i+1, n, layer+1,k);
            
            track.removeLast();
            trackSum-=i;
        }
    }
}