/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.03 %
    Runtime : 23 ms
    Memory Usage : 13.7 MB
    Testcase : 34 / 34 passed
    Ranking : 
        Your runtime beats 89.72 % of python submissions.
        Your memory usage beats 87.03 % of python submissions.
}
*/

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        listtoreturn=[]
        q= collections.deque()
        q.append(root)
        while q:
            Qlen = len(q)
            level = []
            for i in range(Qlen):
                node=q.popleft()
                if node:
                    level.append(node.val)
                    q.append(node.left)
                    q.append(node.right)
            if level:
                listtoreturn.insert(0,level)
        return listtoreturn

        