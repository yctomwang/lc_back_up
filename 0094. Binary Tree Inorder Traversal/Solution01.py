/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.70 %
    Runtime : 23 ms
    Memory Usage : 13.2 MB
    Testcase : 70 / 70 passed
    Ranking : 
        Your runtime beats 71.51 % of python submissions.
        Your memory usage beats 98.76 % of python submissions.
}
*/

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


def helper(node,listofthings):
        if(node==None):
            return listofthings
        list = helper(node.left,listofthings)
        list.append(node.val)
        return helper(node.right, listofthings)
    
class Solution(object):
    
    
    
    
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        listofthings = []
        return helper(root,listofthings)
        