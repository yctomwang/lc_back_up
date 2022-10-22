/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 44.31 %
    Runtime : 16 ms
    Memory Usage : 42.3 MB
    Testcase : 26 / 26 passed
    Ranking : 
        Your runtime beats 6.78 % of java submissions.
        Your memory usage beats 50.58 % of java submissions.
}
*/

class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
    //why dp's size is s.length()+1? because of the nature of substring
    //0 1 2 3 4 5 6 7 8 9 
    //* L E E T C O D E *
    //T F F F F T F F F T
    
        
    //the definiton of the dp array is to all the previous index that came to dp[i]
    List<Integer> dp[] = new ArrayList[s.length()+1];
    for(int i=0;i<dp.length;i++){
        dp[i]= new ArrayList<>();
        
    }
    dp[0].add(0);
    //convert list into a new hashset
    Set<String> wordSet = new HashSet<>(wordDict);
    for(int i=1;i<=s.length();i++){
        for(int j=0;j<i;j++){
            //there exists j 
            if(!dp[j].isEmpty()&&wordSet.contains(s.substring(j,i))){
                dp[i].add(j);
            }
        }
    }
    getResult(dp,"",s.length(),s);
        
    return answer;
    }
    
    public void getResult(List<Integer>[] dp , String curr, int index, String str){
        if(index==0){
            answer.add(curr.trim());
            return;
        }
        
        for(int preindex:dp[index]){
            System.out.println(preindex);
            System.out.println((str.substring(preindex,index)));
            getResult(dp,str.substring(preindex,index)+" "+curr,preindex,str);
        }
    }
    
    
    
}