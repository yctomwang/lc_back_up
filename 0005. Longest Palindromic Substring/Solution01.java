/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 32.36 %
    Runtime : 28 ms
    Memory Usage : 52.1 MB
    Testcase : 140 / 140 passed
    Ranking : 
        Your runtime beats 80.30 % of java submissions.
        Your memory usage beats 36.09 % of java submissions.
}
*/

class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        
        for(int i=0;i<s.length();i++){
            String s1= palindrome(s,i,i);
            String s2= palindrome(s,i,i+1);
            res = res.length() > s1.length() ? res : s1;
        res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }
    public String palindrome(String s, int left, int right){
        //System.out.println(s.charAt(right));
        while(left>=0&&right<s.length()&& s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        //substring is å·¦é­å³å¼çfucntion
        return s.substring(left+1,right);
    }
}