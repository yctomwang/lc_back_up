/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 40.68 %
    Runtime : 1 ms
    Memory Usage : 43.3 MB
    Testcase : 107 / 107 passed
    Ranking : 
        Your runtime beats 53.38 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int en= initialEnergy;
        for(int enOp:energy){
            en-= enOp;
        }
        int ex= initialExperience, exMin= ex;
        for(int exOp:experience){
            exMin= Math.min(exMin, ex-exOp);
            ex+= exOp;
        }
        // calculate required hours of training
        return (en<=0 ? 1-en : 0) + (exMin<=0 ? 1-exMin : 0);
    }
}