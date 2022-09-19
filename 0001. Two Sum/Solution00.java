/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 49.06 %
    Runtime : 10 ms
    Memory Usage : 46.6 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 51.28 % of java submissions.
        Your memory usage beats 10.87 % of java submissions.
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