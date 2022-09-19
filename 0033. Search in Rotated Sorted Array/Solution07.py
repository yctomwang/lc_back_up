/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 38.50 %
    Runtime : 46 ms
    Memory Usage : 13.8 MB
    Testcase : 195 / 195 passed
    Ranking : 
        Your runtime beats 42.42 % of python submissions.
        Your memory usage beats 38.83 % of python submissions.
}
*/

class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        s=0
        e=len(nums)-1
        mid=s+(e-s)/2
        while(s<e):
            if nums[mid]>=nums[0]:
                s=mid+1
            else:
                e=mid
            mid=s+(e-s)/2
        # now s or e become the pivot index
        print("my s,e ",s,e)
        
        if nums[0]<=target and target<=nums[s-1]:
            ns=0
            ne=s 
            nmid=ns+(ne-ns)/2
            while(ns<=ne):
                if nums[nmid]==target:
                    return nmid
                if nums[nmid]<target:
                    ns=nmid+1  
                else:
                    ne=nmid-1

                nmid=ns+(ne-ns)/2
            return -1
            
        else:
            ns=s
            ne=len(nums)-1
            nmid=ns+(ne-ns)/2
            while(ns<=ne):
                if nums[nmid]==target:
                    return nmid
                if nums[nmid]<target:
                    ns=nmid+1  
                else:
                    ne=nmid-1
                nmid=ns+(ne-ns)/2
            return -1    