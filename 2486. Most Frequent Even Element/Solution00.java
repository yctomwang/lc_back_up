/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.43 %
    Runtime : 47 ms
    Memory Usage : 42.5 MB
    Testcase : 219 / 219 passed
    Ranking : 
        Your runtime beats 55.49 % of java submissions.
        Your memory usage beats 91.17 % of java submissions.
}
*/

class Solution {
    public int mostFrequentEven(int[] nums) {
    int answer=-1;
    Arrays.sort(nums);
    int number=-1;
    int count=0;
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            if(number==nums[i]){
                count++;
                answer=Math.max(answer,count);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                number=nums[i];
            }else{
                number=nums[i];
                count=1;
                answer=Math.max(answer,count);
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
    }
    //System.out.println(map.keySet()); 
    if(map.size()==0){return -1;}
    //System.out.println(map.keySet()); 
    for(int curr:map.keySet()){
        if(map.get(curr)==answer){
            return curr;
        }
    }
    return answer;
    }
}