/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 42.57 %
    Runtime : 62 ms
    Memory Usage : 52 MB
    Testcase : 91 / 91 passed
    Ranking : 
        Your runtime beats 65.01 % of java submissions.
        Your memory usage beats 89.46 % of java submissions.
}
*/

class Solution {
    public int totalFruit(int[] fruits) {
        //2 unique characters(fruits)
        //and each character must appear once// continous 
        //longest substring that contains at most 
        int answer=0;
        int left=0;
        Map<Integer, Integer> window= new HashMap<>();
        
        for(int i = 0; i<fruits.length;i++){
            
            
            //into the dictionary we go
            
            int curr = fruits[i];
            window.put(curr,window.getOrDefault(curr,0)+1);
            
            while(window.keySet().size()>2){
                //shrink the window
                int remove= fruits[left];
                window.put(remove,window.getOrDefault(remove,0)-1);
                if(window.getOrDefault(remove,0)==0){
                    window.remove(remove);
                }
                
                left++;
            }
            
            //calculate right here
            answer=Math.max(answer,i-left+1);
        }
        
        return answer;
        
    }
}