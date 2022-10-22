/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 40.34 %
    Runtime : 49 ms
    Memory Usage : 14 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 64.77 % of python3 submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        a = s.split()
        return len(a[-1])
                
            