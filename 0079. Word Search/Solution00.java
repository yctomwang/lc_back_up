/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 39.82 %
    Runtime : 153 ms
    Memory Usage : 41.9 MB
    Testcase : 84 / 84 passed
    Ranking : 
        Your runtime beats 74.75 % of java submissions.
        Your memory usage beats 68.83 % of java submissions.
}
*/

class Solution {
    //new StringBuilder()
    //StringBuilder s1= new StringBuilder();
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //check to see if word's first character is the same as board[i][j]
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visit = new boolean[board.length][board[0].length];
                    visit[i][j] = true;
                    if (backTrack(board, word, i, j, visit, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean backTrack(char[][] board, String word, int index_x, int index_y, boolean[][] visited, int length) {
        //base case
        if (length == word.length() - 1) {
            return true;
        }
        //making decison//
        boolean flag = false;
        for (int[] dir : directions) {
            //check for out of bounds
            int new_x = index_x + dir[0];
            int new_y = index_y + dir[1];
            if (new_x >= 0 && new_x < board.length && new_y >= 0 && new_y < board[0].length) {
                if (board[new_x][new_y] == word.charAt(length + 1)) {
                    //check if visited or not
                    if (visited[new_x][new_y] != true) {
                        visited[new_x][new_y] = true;
                        if (backTrack(board, word, new_x, new_y, visited, length + 1)) {
                            flag = true;
                        }
                        visited[new_x][new_y] = false;
                    }
                }
            }
        }
        return flag;
    }
}