/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 85.74 %
    Runtime : 7 ms
    Memory Usage : 46.8 MB
    Testcase : 399 / 399 passed
    Ranking : 
        Your runtime beats 21.41 % of java submissions.
        Your memory usage beats 11.14 % of java submissions.
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