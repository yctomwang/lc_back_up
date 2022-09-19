/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 70.51 %
    Runtime : 71 ms
    Memory Usage : 16.2 MB
    Testcase : 38 / 38 passed
    Ranking : 
        Your runtime beats 49.10 % of python submissions.
        Your memory usage beats 98.52 % of python submissions.
}
*/

"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution(object):
    def levelOrder(self, root):
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
                    for c in node.children:
                        q.append(c)
            if level:
                listtoreturn.append(level)
        return listtoreturn
