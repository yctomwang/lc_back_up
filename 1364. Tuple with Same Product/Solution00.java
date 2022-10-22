/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.78 %
    Runtime : 309 ms
    Memory Usage : 78.3 MB
    Testcase : 37 / 37 passed
    Ranking : 
        Your runtime beats 88.16 % of java submissions.
        Your memory usage beats 88.47 % of java submissions.
}
*/

class Solution {
    public int tupleSameProduct(int[] nums) {
        int answer =0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product = nums[i]*nums[j];
                map.put(product,map.getOrDefault(product,0)+1);
                
            }
        }
        
        for(int key: map.keySet()){
            int count = map.get(key);
            if(count>1){
                int time= (0+(count-1))*count/2;
                answer+=time*8;
            }
        }
        return answer;
    }
}