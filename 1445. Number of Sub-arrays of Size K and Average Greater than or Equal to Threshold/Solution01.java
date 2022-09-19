/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 67.83 %
    Runtime : 5 ms
    Memory Usage : 68.4 MB
    Testcase : 69 / 69 passed
    Ranking : 
        Your runtime beats 59.69 % of java submissions.
        Your memory usage beats 49.17 % of java submissions.
}
*/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        //size is a threshold
        //k is a threshold
        int answer=0;
        int total=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            int curr= arr[i];
            total+= curr;
            //out
            while(i-left+1>k){
                int remove = arr[left];
                total-= remove;
                left++;
                
            }
            // System.out.println("left"+left);
            // System.out.println("right"+i);
            //calculate
            
            if(total>=(i-left+1)*threshold&&(i-left+1)==k){
                answer++;
            }
            // if((total/(i-left+1))>=threshold){
            //     answer++;
            // }
            
            
        }
        
        return answer;
        
        
        
    }
}