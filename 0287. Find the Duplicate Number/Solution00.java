/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.08 %
    Runtime : 70 ms
    Memory Usage : 94.1 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 5.32 % of java submissions.
        Your memory usage beats 6.13 % of java submissions.
}
*/

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
}