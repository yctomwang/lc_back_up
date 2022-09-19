/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.28 %
    Runtime : 1 ms
    Memory Usage : 42.5 MB
    Testcase : 25 / 25 passed
    Ranking : 
        Your runtime beats 96.12 % of java submissions.
        Your memory usage beats 74.24 % of java submissions.
}
*/

class Solution {
    
    private String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private List<String> answer = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return answer;
        backTrack(digits,0,"");
        return answer;
    }
    
    private void backTrack(String digits,int index,String partialAns){
        //exit of the recursion
        if(index==digits.length()-1){
            //'3'
            StringBuilder sb = new StringBuilder(partialAns);
            int numIndex= Character.getNumericValue(digits.charAt(index));
            for(int i=0;i<mapping[numIndex].length();i++){
                char curr= mapping[numIndex].charAt(i);
                sb.append(curr);
                answer.add(sb.toString());
                sb.deleteCharAt(sb.length()-1);
            }
            return;  
        }
        
        StringBuilder sb = new StringBuilder(partialAns);
        int numIndex= Character.getNumericValue(digits.charAt(index));
        for(int i=0;i<mapping[numIndex].length();i++){
            char curr= mapping[numIndex].charAt(i);
            sb.append(curr);
            backTrack(digits,index+1,sb.toString());
            sb.deleteCharAt(sb.length()-1);
        }
        
        
    }
}