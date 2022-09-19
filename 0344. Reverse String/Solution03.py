/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 75.90 %
    Runtime : 206 ms
    Memory Usage : 23 MB
    Testcase : 477 / 477 passed
    Ranking : 
        Your runtime beats 72.76 % of python submissions.
        Your memory usage beats 6.04 % of python submissions.
}
*/

class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        for i, j in zip(range(0, len(s)/2), range(len(s)-1, 0, -1)):
            
            temp=s[i]
            s[i]=s[j]
            s[j]=temp
           