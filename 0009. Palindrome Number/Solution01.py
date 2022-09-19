/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.76 %
    Runtime : 77 ms
    Memory Usage : 13.3 MB
    Testcase : 11510 / 11510 passed
    Ranking : 
        Your runtime beats 71.78 % of python submissions.
        Your memory usage beats 85.30 % of python submissions.
}
*/

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        return str(x) == str(x)[::-1]