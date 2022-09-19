/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.94 %
    Runtime : 18 ms
    Memory Usage : 54.2 MB
    Testcase : 61 / 61 passed
    Ranking : 
        Your runtime beats 25.37 % of java submissions.
        Your memory usage beats 16.35 % of java submissions.
}
*/

class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> hash_table = new HashMap<>();

    for (int i : nums) {
      hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
    }
    for (int i : nums) {
      if (hash_table.get(i) == 1) {
        return i;
      }
    }
    return 0;
  }
}