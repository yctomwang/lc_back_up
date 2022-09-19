/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 43.88 %
    Runtime : 120 ms
    Memory Usage : 89 MB
    Testcase : 44 / 44 passed
    Ranking : 
        Your runtime beats 88.60 % of java submissions.
        Your memory usage beats 92.16 % of java submissions.
}
*/

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
    Arrays.sort(properties, (a,b)-> (a[0]==b[0])?(b[1]-a[1]): a[0]-b[0]);
    
        int weakCharacters = 0;
        int maxDefense = 0;
        for (int i = properties.length - 1; i >= 0; i--) {
            // Compare the current defense with the maximum achieved so far
            if (properties[i][1] < maxDefense) {
                weakCharacters++;
            }
            maxDefense = Math.max(maxDefense, properties[i][1]);
        }
        
        return weakCharacters;
    }
}