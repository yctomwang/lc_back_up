/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 75.90 %
    Runtime : 300 ms
    Memory Usage : 21.1 MB
    Testcase : 477 / 477 passed
    Ranking : 
        Your runtime beats 30.65 % of python submissions.
        Your memory usage beats 78.95 % of python submissions.
}
*/

class Solution:
    def reverseString(self, s):
        left, right = 0, len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left, right = left + 1, right - 1