/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.37 %
    Runtime : 8 ms
    Memory Usage : 47.6 MB
    Testcase : 45 / 45 passed
    Ranking : 
        Your runtime beats 72.53 % of java submissions.
        Your memory usage beats 19.50 % of java submissions.
}
*/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet<String>(wordDict),0, new Boolean[s.length()]);
    }
    
    public boolean dfs(String s, Set<String> wordDic, int index, Boolean[] memo){
        //we have reached the end
        if(index==s.length()) return true;
        if(memo[index]!=null) return memo[index];
        
        //for loop through the whole list of possible next states
        //if any of them can return true, we set outself to true
        
        for(int i=index+1;i<=s.length();i++){
            if(wordDic.contains(s.substring(index,i))){
               if(dfs(s,wordDic,i,memo)){
                   return memo[index]=true;
               }
            }
        }
        
        return memo[index]=false;
        
        
        
        
        
    }
}