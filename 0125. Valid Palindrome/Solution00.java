/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 43.21 %
    Runtime : 4 ms
    Memory Usage : 42.7 MB
    Testcase : 480 / 480 passed
    Ranking : 
        Your runtime beats 91.12 % of java submissions.
        Your memory usage beats 91.28 % of java submissions.
}
*/

class Solution {
    public boolean isPalindrome(String s) {
        int leftindex=0;
        int rightindex=s.length()-1;
        while(leftindex<rightindex){
        while(leftindex<rightindex&&!Character.isLetterOrDigit(s.charAt(leftindex))){
            leftindex++;
        }
        while(leftindex<rightindex&&!Character.isLetterOrDigit(s.charAt(rightindex))){
            rightindex--;
        }
        if (Character.toLowerCase(s.charAt(leftindex)) != Character.toLowerCase(s.charAt(rightindex))){
            return false;
        }
        leftindex++;
        rightindex--;
        
        }
        return true;
    }
}