/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 67.82 %
    Runtime : 82 ms
    Memory Usage : 67 MB
    Testcase : 161 / 161 passed
    Ranking : 
        Your runtime beats 16.26 % of java submissions.
        Your memory usage beats 77.76 % of java submissions.
}
*/

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: paths){
            String[] stringArr = s.split(" ");
            String root = stringArr[0];
            for(int i=1;i<stringArr.length;i++){
                
                String curr = stringArr[i];
                String[] currArr = curr.split("\\(");
                String filename = currArr[0];
                String actual_content = currArr[1];
                StringBuilder sb = new StringBuilder(actual_content);
                sb.deleteCharAt(sb.length()-1);
                actual_content = sb.toString();
                List<String> list = map.getOrDefault(actual_content, new ArrayList<String>());
                list.add(root+"/"+filename);
                map.put(actual_content, list);
                
            }
        }
        
        List<List<String>> answer = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key).size()>1)answer.add(map.get(key));    
        }
        
        return answer;
    }
}