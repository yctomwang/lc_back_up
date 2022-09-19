/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 62.94 %
    Runtime : 15 ms
    Memory Usage : 13.9 MB
    Testcase : 34 / 34 passed
    Ranking : 
        Your runtime beats 98.68 % of python submissions.
        Your memory usage beats 29.81 % of python submissions.
}
*/

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        listreturn=[]
        q= collections.deque()
        q.append(root)
        while(q):
            quelen=len(q)
            minilist=[]
            for i in range(quelen):
                node=q.popleft()
                if(node):
                    q.append(node.left)
                    minilist.append(node.val)
                    q.append(node.right)
            if(minilist):
                listreturn.append(minilist)
        
        
        return listreturn
        
        