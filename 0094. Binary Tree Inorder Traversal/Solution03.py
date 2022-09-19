/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.70 %
    Runtime : 52 ms
    Memory Usage : 13.6 MB
    Testcase : 70 / 70 passed
    Ranking : 
        Your memory usage beats 20.59 % of python submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        stackTree=[]
        valueReturn=[]
        #deal with empty tree
        if(root==None):
            return valueReturn
        
        
        currentTreeNode=root
        while(currentTreeNode!=None or (len(stackTree)!=0)):
            while(currentTreeNode!=None):
                stackTree.append(currentTreeNode)
                currentTreeNode=currentTreeNode.left
            currentTreeNode=stackTree.pop()
            valueReturn.append(currentTreeNode.val)
            currentTreeNode=currentTreeNode.right
        return valueReturn
        
       
    
       
            
        