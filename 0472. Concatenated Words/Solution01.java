/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 45.51 %
    Runtime : 137 ms
    Memory Usage : 74.7 MB
    Testcase : 42 / 42 passed
    Ranking : 
        Your runtime beats 47.04 % of java submissions.
        Your memory usage beats 41.69 % of java submissions.
}
*/

class Solution {
    //brute force backtracking
    
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        //Arrays.sort(words,(a,b)-> b.length()-a.length());
        List<String> answer = new ArrayList<>();
        
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(s);
        }
        
        for(int i=0;i<words.length;i++){
            //now perform the whole word break trick
            set.remove(words[i]);
            if(wordBreak(words[i],set)){
                answer.add(words[i]);
            }
            set.add(words[i]);
        }
        
        
        return answer;
    }
    
    
   public boolean wordBreak(String s, Set<String> wordDict) {
        return dfs(s, wordDict,0, new Boolean[s.length()]);
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