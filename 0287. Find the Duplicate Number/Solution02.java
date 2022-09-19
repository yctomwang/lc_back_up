/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.08 %
    Runtime : 54 ms
    Memory Usage : 93.5 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 14.44 % of java submissions.
        Your memory usage beats 8.80 % of java submissions.
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