/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.24 %
    Runtime : 7 ms
    Memory Usage : 50.1 MB
    Testcase : 24 / 24 passed
    Ranking : 
        Your runtime beats 95.21 % of java submissions.
        Your memory usage beats 98.49 % of java submissions.
}
*/

class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int[]i : intervals){
            //if no overlap then just put back
            if(i[1]<=toBeRemoved[0]||i[0]>=toBeRemoved[1]){
                answer.add(Arrays.asList(i[0],i[1]));
            }else{
                if(i[0]<toBeRemoved[0]) answer.add(Arrays.asList(i[0],toBeRemoved[0]));
                
                if(i[1]>toBeRemoved[1]) answer.add(Arrays.asList(toBeRemoved[1],i[1]));
            }
        }
        
        return answer;
        
    }
}