/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 73.20 %
    Runtime : 99 ms
    Memory Usage : 67.6 MB
    Testcase : 59 / 59 passed
    Ranking : 
        Your runtime beats 23.32 % of java submissions.
        Your memory usage beats 24.75 % of java submissions.
}
*/

class Solution {
    public int partitionString(String s) {
    //a
    //HashMap<Charcter,Integer> map = new HashMap<>();
    Set<Character> set = new HashSet<>();
    
    int count=0;
    int left=0;
    for(int i=0;i<s.length();i++){
        char curr= s.charAt(i);
        if(!set.contains(curr)){
            set.add(curr);
        }else{
            count++;
            set = new HashSet<>();
            set.add(curr);
        }
        
    }
    
    return count+1;
           
    }
}