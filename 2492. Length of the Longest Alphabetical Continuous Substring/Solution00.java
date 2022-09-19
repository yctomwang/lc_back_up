/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 53.28 %
    Runtime : 15 ms
    Memory Usage : 54.2 MB
    Testcase : 123 / 123 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int longestContinuousSubstring(String s) {
    int answer=1;
    int currLen=1;
    
    char previous=s.charAt(0);
    for(int i=1;i<s.length();i++){
        char curr=s.charAt(i);
        if(curr-previous==1){
            currLen++;
            previous=curr;
            answer=Math.max(currLen,answer);
        }
        else{
            currLen=1;
            previous=curr;
        }
    }
    return answer;
    }
}