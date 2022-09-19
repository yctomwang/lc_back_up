/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.65 %
    Runtime : 16 ms
    Memory Usage : 57.9 MB
    Testcase : 117 / 117 passed
    Ranking : 
        Your runtime beats 40.67 % of java submissions.
        Your memory usage beats 25.07 % of java submissions.
}
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> answerMap = new HashMap<>();
        
        for(String s: strs){
            char [] a = s.toCharArray();
            Arrays.sort(a);
            //System.out.println(Arrays.toString(a));
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