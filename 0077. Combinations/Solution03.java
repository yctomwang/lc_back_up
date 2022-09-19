/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.70 %
    Runtime : 57 ms
    Memory Usage : 68 MB
    Testcase : 27 / 27 passed
    Ranking : 
        Your runtime beats 20.35 % of java submissions.
        Your memory usage beats 10.36 % of java submissions.
}
*/

class Solution {
   List<List<Integer>> res = new LinkedList<>();
// è®°å½åæº¯ç®æ³çéå½è·¯å¾
LinkedList<Integer> track = new LinkedList<>();

// ä¸»å½æ°
public List<List<Integer>> combine(int n, int k) {
    backtrack(1, n, k);
    return res;
}

void backtrack(int start, int n, int k) {
    // base case
    if (k == track.size()) {
        // éåå°äºç¬¬ k å±ï¼æ¶éå½åèç¹çå¼
        res.add(new LinkedList<>(track));
        return;
    }
    
    // åæº¯ç®æ³æ åæ¡æ¶
    for (int i = start; i <= n; i++) {
        // éæ©
        track.addLast(i);
        // éè¿ start åæ°æ§å¶æ æçéåï¼é¿åäº§çéå¤çå­é
        backtrack(i + 1, n, k);
        // æ¤ééæ©
        track.removeLast();
    }
}
}