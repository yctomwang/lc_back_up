/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.07 %
    Runtime : 4 ms
    Memory Usage : 42.8 MB
    Testcase : 147 / 147 passed
    Ranking : 
        Your runtime beats 82.67 % of java submissions.
        Your memory usage beats 78.89 % of java submissions.
}
*/

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
    // 200, 500, 800,   power of 100000, score 0
    //3
    Arrays.sort(tokens);
    if(tokens.length==0){return 0;}
    //System.out.println(tokens);
    if(tokens[0]>power) return 0;
    int score =0; 
    int answer=0;
    int leftPointer = 0;
    int rightPointer = tokens.length-1;
    while(rightPointer>=leftPointer){
        if(power>=tokens[leftPointer]){
            score+=1;
            power-=tokens[leftPointer];
            leftPointer++;
            answer=Math.max(answer,score);
        }
        else if(power<tokens[leftPointer]&&score>0){
            score-=1;
            power+=tokens[rightPointer];
            rightPointer--;
        }
        else{
            return answer;
        }
    }
    return answer;
    }
}