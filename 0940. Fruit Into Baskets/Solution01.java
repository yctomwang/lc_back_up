/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 42.57 %
    Runtime : 156 ms
    Memory Usage : 119.1 MB
    Testcase : 91 / 91 passed
    Ranking : 
        Your runtime beats 7.85 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int answer=0;
        Map<Integer,Integer> window = new HashMap<>();
        int left=0;
        int count=0;
        for(int i=0; i<fruits.length;i++ ){
            int curr= fruits[i];
            window.put(curr,window.getOrDefault(curr,0)+1);
            if(window.getOrDefault(curr,0)==1){
                count++;
            }
            while(count>2){
                //then we reduce
                int remove= fruits[left];
                window.put(remove,window.getOrDefault(remove,0)-1);
                if(window.get(remove)==0){
                    count--;
                }
                left++;
            }
            answer= Math.max(answer,i-left+1);
            
        }
        return answer;
        
    }
}