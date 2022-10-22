/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 44.31 %
    Runtime : 2 ms
    Memory Usage : 42.7 MB
    Testcase : 26 / 26 passed
    Ranking : 
        Your runtime beats 84.65 % of java submissions.
        Your memory usage beats 17.78 % of java submissions.
}
*/

class Solution {
    List<String> answer = new ArrayList<>();
    HashSet<String> wordSet;
    public List<String> wordBreak(String s, List<String> wordDict) {
        wordSet = new HashSet(wordDict);
        dfs(s,0,new StringBuilder());
        return answer;
    }
    
    
    private void dfs(String s, int index, StringBuilder curr){
        if(index==s.length()){
            answer.add(curr.toString());
            return;
        }
        
        for(int i= index;i<s.length();i++){
            if(wordSet.contains(s.substring(index,i+1))){
                int beforeAdding = curr.length();
                if(beforeAdding==0){
                    curr.append(s.substring(index,i+1));
                }else{
                    curr.append(" ");
                    curr.append(s.substring(index,i+1));
                }
                dfs(s,i+1,curr);
                curr.delete(beforeAdding,curr.length());
            }  
        }
        
    }
}