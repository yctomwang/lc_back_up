/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 49.06 %
    Runtime : 9 ms
    Memory Usage : 46.1 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 52.79 % of java submissions.
        Your memory usage beats 18.18 % of java submissions.
}
*/

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         //solve it like how we solve for the trap rainwater questions
//         //first we need to sort the array
//         //start with having both pointers one at the start and one at end
//         int left=0;
//         int right= nums.length-1;
//         //
//         while(left<right){
            
//         }
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Integer[] ind = new Integer[len];
        for(int i = 0; i < len; i++) ind[i] = i;
        Arrays.sort(ind, (l, r) -> nums[l] - nums[r]);
        int i = 0, j = len - 1;
        while(i < j) {
            int val = nums[ind[i]] + nums[ind[j]];
            if(val == target) return new int[] {ind[i], ind[j]};
            if(val < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[] {-1, -1};
    }
}