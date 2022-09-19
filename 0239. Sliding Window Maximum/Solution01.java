/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 46.58 %
    Runtime : 816 ms
    Memory Usage : 184.1 MB
    Testcase : 51 / 51 passed
    Ranking : 
        Your memory usage beats 5.48 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        //List<Integer> answer = new ArrayList<>();
        //int n = nums.length;
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
                
                answer[arraycounter]=treemap.lastKey();
                arraycounter++;
                //answer.add(treemap.lastKey());
            }
        }
//         int[] arr = new int[answer.size()];
  
//         // ArrayList to Array Conversion
//         for (int i = 0; i < answer.size(); i++)
//             arr[i] = answer.get(i);
        return answer;
    }
}