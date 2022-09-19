/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 46.58 %
    Runtime : 597 ms
    Memory Usage : 59.5 MB
    Testcase : 51 / 51 passed
    Ranking : 
        Your runtime beats 5.49 % of java submissions.
        Your memory usage beats 92.95 % of java submissions.
}
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        
        int[] answer = new int[nums.length - k + 1];
        int arraycounter=0;
        int totalcount=0;
        TreeMap<Integer, Integer> treemap  = new TreeMap<>();
        int left=0;
        for(int i=0; i<nums.length;i++){
            //in
            int curr= nums[i];
            treemap.put(curr,treemap.getOrDefault(curr,0)+1);
            totalcount+=1;
            
            //out
            while(totalcount>k){
                int remove= nums[left];
                treemap.put(remove,treemap.getOrDefault(remove,0)-1);
                if(treemap.getOrDefault(remove,0)==0){
                    treemap.remove(remove);
                }
                
                totalcount--;
                left++;
            }
            
            if(totalcount==k){
                //nlog n
                answer[arraycounter]=treemap.lastKey();
                arraycounter++;
                
            }
        }

        return answer;
    }
}