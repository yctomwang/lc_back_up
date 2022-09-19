/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 85.74 %
    Runtime : 3 ms
    Memory Usage : 42.7 MB
    Testcase : 399 / 399 passed
    Ranking : 
        Your runtime beats 33.07 % of java submissions.
        Your memory usage beats 90.25 % of java submissions.
}
*/

class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new HashMap<>();
        //put everything into the map
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        
        StringBuilder str = new StringBuilder();
        for(int j=0;j<indices.length;j++){
            str.append(map.get(j));
        }
        return str.toString();
    }
}