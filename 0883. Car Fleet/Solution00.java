/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.76 %
    Runtime : 203 ms
    Memory Usage : 100.4 MB
    Testcase : 48 / 48 passed
    Ranking : 
        Your runtime beats 29.32 % of java submissions.
        Your memory usage beats 18.33 % of java submissions.
}
*/

class Solution {
      public int carFleet(int target, int[] pos, int[] speed) {
        Map<Integer, Double> m = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < pos.length; ++i)
            m.put(pos[i], (double)(target - pos[i]) / speed[i]);
        int res = 0; double cur = 0;
        for (double time : m.values()) {
            if (time > cur) {
                cur = time;
                res++;
            }
        }
        return res;
    }
}