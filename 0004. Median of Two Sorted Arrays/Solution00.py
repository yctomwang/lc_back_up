/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 34.96 %
    Runtime : 189 ms
    Memory Usage : 14.1 MB
    Testcase : 2094 / 2094 passed
    Ranking : 
        Your runtime beats 28.03 % of python3 submissions.
        Your memory usage beats 66.95 % of python3 submissions.
}
*/

class Solution:
    def findMedianSortedArrays(self, num1: List[int], num2: List[int]) -> float:
        num1.extend(num2)
        num1.sort()
        if len(num1) % 2 ==1:
            ans = num1[len(num1)//2]
        else:
            ans = (num1[len(num1)//2-1] + num1[len(num1)//2])/ 2
        return ans