/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 75.90 %
    Runtime : 258 ms
    Memory Usage : 22.8 MB
    Testcase : 477 / 477 passed
    Ranking : 
        Your runtime beats 50.39 % of python submissions.
        Your memory usage beats 6.08 % of python submissions.
}
*/

class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        for i, j in zip(range(0, len(s)/2), range(len(s)-1, 0, -1)):
            if(i<len(s)/2):
                temp=s[i]
                s[i]=s[j]
                s[j]=temp
           
            else:
                pass
          