/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.25 %
    Runtime : 13 ms
    Memory Usage : 53.7 MB
    Testcase : 113 / 113 passed
    Ranking : 
        Your runtime beats 10.56 % of java submissions.
        Your memory usage beats 72.26 % of java submissions.
}
*/

public class Solution {
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        Queue < Integer > queue = new LinkedList < > ();
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                queue.add(i);
                while (!queue.isEmpty()) {
                    int s = queue.remove();
                    visited[s] = 1;
                    for (int j = 0; j < M.length; j++) {
                        if (M[s][j] == 1 && visited[j] == 0)
                            queue.add(j);
                    }
                }
                count++;
            }
        }
        return count;
    }
}