/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 56.19 %
    Runtime : 31 ms
    Memory Usage : 13.6 MB
    Testcase : 60 / 60 passed
    Ranking : 
        Your runtime beats 34.90 % of python submissions.
        Your memory usage beats 37.07 % of python submissions.
}
*/

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if not p and not q:
            return True
        if not p or not q or p.val!=q.val:
            return False
        return(self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right))