/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 49.06 %
    Runtime : 6 ms
    Memory Usage : 47.5 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 63.01 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        //for loop through thhe list,
        for(int i=0;i<nums.length;i++){
            //put the key value pair into dictionary
            //key is value, value is the index in list
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int search=target-nums[i];
            if (map.containsKey(search) && map.get(search) != i) {
                return new int[] { i, map.get(search) };
            }
            
            
        }
        return null;
    }
}