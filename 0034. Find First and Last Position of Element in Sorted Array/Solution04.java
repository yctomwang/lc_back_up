/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 41.36 %
    Runtime : 0 ms
    Memory Usage : 45.2 MB
    Testcase : 88 / 88 passed
    Ranking : 
        Your memory usage beats 98.44 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    }

    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // æç´¢åºé´ä¸º [left, right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // æç´¢åºé´åä¸º [mid+1, right]
                left = mid + 1;
            } else if (nums[mid] > target) {
                // æç´¢åºé´åä¸º [left, mid-1]
                right = mid - 1;
            } else if (nums[mid] == target) {
                // æ¶ç¼©å³ä¾§è¾¹ç
                right = mid - 1;
            }
        }
        // æ£æ¥åºçæåµ
        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // è¿éæ¹ææ¶ç¼©å·¦ä¾§è¾¹çå³å¯
                left = mid + 1;
            }
        }
        // è¿éæ¹ä¸ºæ£æ¥ right è¶ççæåµï¼è§ä¸å¾
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
// è¯¦ç»è§£æåè§ï¼
// https://labuladong.github.io/article/?qno=34
