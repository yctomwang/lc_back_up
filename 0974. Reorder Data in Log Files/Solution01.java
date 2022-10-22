/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.41 %
    Runtime : 10 ms
    Memory Usage : 47.9 MB
    Testcase : 65 / 65 passed
    Ranking : 
        Your runtime beats 61.76 % of java submissions.
        Your memory usage beats 50.28 % of java submissions.
}
*/

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> numLog = new ArrayList<>();
        List<String> wordLog = new ArrayList<>();
        for(String curr: logs){
            String[] split1 = curr.split(" ", 2);
            char determine = split1[1].charAt(0);
            boolean flag=Character.isDigit(determine);
            if(flag){
                numLog.add(curr);
            }else{
                wordLog.add(curr);
            }
            
            
        }
        
        
        // now lets sort letter log
        Collections.sort(wordLog,(a,b)->{
            String[] asplit = a.split(" ",2);
            String[] bsplit = b.split(" ",2);
            
            String a_id = asplit[0];
            String b_id = bsplit[0];
            
            String a_content = asplit[1];
            String b_content = bsplit[1];
            if(a_content.equals(b_content)){
                return a_id.compareTo(b_id);
            }else{
                return a_content.compareTo(b_content);
            }
        });
        
        String[] answer = new String[logs.length];
        int counter =0;
        for(int i=0;i<wordLog.size();i++){
            
            answer[i]=wordLog.get(i);
            counter++;
        }
        
        for(int i=0;i<numLog.size();i++){
            answer[counter]=numLog.get(i);
            counter++;
        }
        
        return answer;
    }
}