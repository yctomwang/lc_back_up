/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 73.45 %
    Runtime : 1 ms
    Memory Usage : 42.3 MB
    Testcase : 104 / 104 passed
    Ranking : 
        Your runtime beats 91.90 % of java submissions.
        Your memory usage beats 48.14 % of java submissions.
}
*/

class Solution {
      public String smallestNumber(String s) {
        StringBuilder res = new StringBuilder(), stack = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            stack.append((char)('1' + i));
            if (i == s.length() || s.charAt(i) == 'I') {
                res.append(stack.reverse());
                stack = new StringBuilder();
            }
        }
        return res.toString();
    }
}