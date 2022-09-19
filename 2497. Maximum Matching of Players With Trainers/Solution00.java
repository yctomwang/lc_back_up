/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.60 %
    Runtime : 29 ms
    Memory Usage : 87.3 MB
    Testcase : 35 / 35 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
    int p =0;
    int t=0;
    int count=0;
    Arrays.sort(players);
    Arrays.sort(trainers);
        
    while(t<trainers.length&&p<players.length){
        int play=players[p];
        int train=trainers[t];
        if(play<=train){
            count++;
            p++;
            t++;
        }else if(play>train){
            t++;
        }
    }
    
        
    return count;
    
        
    
    }
}