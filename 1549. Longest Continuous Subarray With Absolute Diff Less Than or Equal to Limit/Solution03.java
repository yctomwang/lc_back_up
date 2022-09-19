/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 47.82 %
    Runtime : 99 ms
    Memory Usage : 76 MB
    Testcase : 61 / 61 passed
    Ranking : 
        Your runtime beats 34.37 % of java submissions.
        Your memory usage beats 37.21 % of java submissions.
}
*/

class Solution {
    public int longestSubarray(int[] data, int x) {
        List<Integer> answer = new LinkedList<>();
        int left=0;
        //x is the difference between 2 days
        int start=0;
        int len=0;
        int maxlen=0;
        //use treemap to define legal window
        TreeMap<Integer, Integer> window = new TreeMap<>();
        for(int i=0;i<data.length;i++){
            //in
            int curr=data[i];
            window.put(curr,window.getOrDefault(curr, 0)+1);
            len++;
            int minKey = window.firstKey();
            int maxKey = window.lastKey();
            //kick things out of window
            while(Math.abs(window.lastKey()-window.firstKey())>x&&left<data.length){
                //have to update the max key and min key in here
                // minKey = window.firstKey();
                // maxKey = window.lastKey();
                
                int remove=data[left];
                window.put(remove,window.getOrDefault(remove, 0)-1);
                if(window.get(remove)==0){
                    window.remove(remove);
                }
                len--;
                
                left++;
                //System.out.println(left);
            }
            
            
            //calculate when window is valid
            // System.out.print("left"+left);
            // System.out.println("len"+len);
            if(len>maxlen){
                
                start=left;
                maxlen=len;
            }
           // System.out.println(start);
            
        }
        
        return maxlen;
        
    }
   
}