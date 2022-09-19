/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 75.90 %
    Runtime : 246 ms
    Memory Usage : 43.6 MB
    Testcase : 477 / 477 passed
    Ranking : 
        Your runtime beats 56.32 % of python submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution:
    def reverseString(self, s):
        def helper(left, right):
            if left < right:
                s[left], s[right] = s[right], s[left]
                helper(left + 1, right - 1)

        helper(0, len(s) - 1)
          