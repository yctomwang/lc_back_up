/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 85.19 %
    Runtime : 3 ms
    Memory Usage : 107.9 MB
    Testcase : 46 / 46 passed
    Ranking : 
        Your runtime beats 79.08 % of java submissions.
        Your memory usage beats 16.44 % of java submissions.
}
*/

class Solution {
    public int[] findArray(int[] pref) {
        int[] answer = new int[pref.length];
        int xor= pref[0];
        
        answer[0]=xor;
        for(int i=1;i<pref.length;i++){
            //System.out.println("before"+xor);
            //System.out.println("pref"+pref[i]);
            int temp= xor^pref[i];
            //System.out.println("after"+xor);
            answer[i]=temp;
            xor=temp^xor;
        }
        
        return answer;
    }
}