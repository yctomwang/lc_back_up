/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.06 %
    Runtime : 71 ms
    Memory Usage : 79.4 MB
    Testcase : 50 / 50 passed
    Ranking : 
        Your runtime beats 6.95 % of java submissions.
        Your memory usage beats 7.95 % of java submissions.
}
*/

class Solution {
   public int[][] updateMatrix(int[][] A) {
            int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
            Queue<int[]> q = new LinkedList<>();

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    if (A[i][j] == 0) {
                        q.offer(new int[]{i, j});
                    }
                }
            }

            int level = 1;
            HashSet<int[]> visited = new HashSet<>();
            while (!q.isEmpty()) {
               
                 //for (int i = q.size(); i > 0; i--) {
                int qsize = q.size();
                for(int i=0;i<qsize;i++){
                    int[] xy = q.poll();
                    visited.add(xy);
                    for (int[] d : dir) {
                        int nx = xy[0] + d[0];
                        int ny = xy[1] + d[1];
                        if (nx >= 0 && nx < A.length && ny >= 0 && ny < A[0].length&&!visited.contains(A[nx][ny]) && A[nx][ny] == 1) {
                            A[nx][ny] = -level;
                            q.offer(new int[]{nx, ny});
                        }
                    }
                }
                 level++;
            }

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] *= -1;
                }
            }

            return A;}
}