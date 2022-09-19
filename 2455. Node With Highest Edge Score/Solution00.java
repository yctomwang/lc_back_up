/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.64 %
    Runtime : 157 ms
    Memory Usage : 160.1 MB
    Testcase : 116 / 116 passed
    Ranking : 
        Your runtime beats 28.37 % of java submissions.
        Your memory usage beats 14.00 % of java submissions.
}
*/

class Solution {
    public int edgeScore(int[] edges) {
        int indexmax=Integer.MAX_VALUE;
        int amountmax=Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            map.put(edges[i],map.getOrDefault(edges[i],0)+i);
            if(map.get(edges[i])>amountmax){
                indexmax=edges[i];
                amountmax=map.get(edges[i]);
            } else if(map.get(edges[i])==amountmax&&edges[i]<indexmax){
                 indexmax=edges[i];
                amountmax=map.get(edges[i]);
            }
        }
        
//         for(int val : map.keySet()){
//             indexmax=val;
//             amountmax=map.get(indexmax);
//         }
        return indexmax;
    }
}