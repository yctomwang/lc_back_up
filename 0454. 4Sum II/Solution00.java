/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.29 %
    Runtime : 253 ms
    Memory Usage : 56.5 MB
    Testcase : 132 / 132 passed
    Ranking : 
        Your runtime beats 42.84 % of java submissions.
        Your memory usage beats 76.83 % of java submissions.
}
*/

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int cnt = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                m.put(a + b, m.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                cnt += m.getOrDefault(-(c + d), 0);
            }
        }
        return cnt;
    }
}