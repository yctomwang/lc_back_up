/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 75.90 %
    Runtime : 1 ms
    Memory Usage : 54.6 MB
    Testcase : 477 / 477 passed
    Ranking : 
        Your runtime beats 99.91 % of java submissions.
        Your memory usage beats 58.39 % of java submissions.
}
*/

class Solution {
    public void reverseString(char[] s) {
        
         for (int i = 0, j = (s.length-1); i < (s.length/2); i++, j--) {
            
             char temp = s[i];
             s[i]=s[j];
             s[j]=temp;
         }
        
        
    }
}