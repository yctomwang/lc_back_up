/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 55.53 %
    Runtime : 3 ms
    Memory Usage : 43.9 MB
    Testcase : 56 / 56 passed
    Ranking : 
        Your runtime beats 86.54 % of java submissions.
        Your memory usage beats 47.39 % of java submissions.
}
*/

class Solution {
   public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0, j = 0, k = 0;
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            ++i;
        } else if (nums1[i] > nums2[j]) {
            ++j;
        } else {
            nums1[k++] = nums1[i++];
            ++j;
        }
    }
    return Arrays.copyOfRange(nums1, 0, k);
}
}