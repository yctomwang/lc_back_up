/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.65 %
    Runtime : 65 ms
    Memory Usage : 61 MB
    Testcase : 117 / 117 passed
    Ranking : 
        Your runtime beats 11.25 % of java submissions.
        Your memory usage beats 16.40 % of java submissions.
}
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> answerMap = new HashMap<>();
        
        for(String s: strs){
            char [] a = s.toCharArray();
            Arrays.sort(a);
            System.out.println(a.toString());
            String key =Arrays.toString(a);
            
            if(answerMap.containsKey(key)==true){
                
            }
            else{
                answerMap.put(key, new ArrayList<String>());
            }
            List<String> aDD =answerMap.get(key);
                aDD.add(s);
                answerMap.put(key,aDD);
        }
        
        for(List<String> list:answerMap.values()){
            answer.add(list);
        }
        return answer;
        
    }
}