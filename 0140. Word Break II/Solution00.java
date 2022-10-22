/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 44.31 %
    Runtime : 1 ms
    Memory Usage : 42.3 MB
    Testcase : 26 / 26 passed
    Ranking : 
        Your runtime beats 99.33 % of java submissions.
        Your memory usage beats 50.58 % of java submissions.
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
    
    //backtracking
    private void dfs(String s, int index, StringBuilder curr){
        if(index==s.length()){
            //add the path to answer
            answer.add(curr.toString());
            return;
        }
        //for current index
        for(int i= index;i<s.length();i++){
            //loop through from current index and seek for next break
            //precheck before calling dfs
            if(wordSet.contains(s.substring(index,i+1))){
                //record the breaking point
                int beforeAdding = curr.length();
                //deal with sepaical case of appending for the frist time
                if(beforeAdding==0){
                    curr.append(s.substring(index,i+1));
                }else{
                    curr.append(" ");
                    curr.append(s.substring(index,i+1));
                }
                //call dfs to further gohead
                dfs(s,i+1,curr);
                curr.delete(beforeAdding,curr.length());
            }  
        }
        
    }
}