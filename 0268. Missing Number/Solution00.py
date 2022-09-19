/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.26 %
    Runtime : 179 ms
    Memory Usage : 14.8 MB
    Testcase : 122 / 122 passed
    Ranking : 
        Your runtime beats 57.29 % of python submissions.
        Your memory usage beats 44.07 % of python submissions.
}
*/

class Solution:
    def missingNumber(self, nums):
        nums.sort()

        # Ensure that n is at the last index
        if nums[-1] != len(nums):
            return len(nums)
        # Ensure that 0 is at the first index
        elif nums[0] != 0:
            return 0

        # If we get here, then the missing number is on the range (0, n)
        for i in range(1, len(nums)):
            expected_num = nums[i-1] + 1
            if nums[i] != expected_num:
                return expected_num