/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 46.58 %
    Runtime : 919 ms
    Memory Usage : 149.4 MB
    Testcase : 51 / 51 passed
    Ranking : 
        Your memory usage beats 58.82 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length, maxArrInd = 0;
        int[] maxArr = new int[n - k + 1];
        
        //sorted map by keys to store k(k window) elements of array
        TreeMap<Integer, Integer> map = new TreeMap<>(); 
        
        // for first k elements
        for(int i=0;i<k;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // maxArr[0]
        maxArr[0] = map.lastKey();        
        maxArrInd++;
        
        // for first kth elements to nth element
        // maxArr[1] to maxArr[n - k]
        for(int i = 0; i< n - k ; i++){
            
            // removing ith element, checking count > 0
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i]) <= 0)
                    map.remove(nums[i]);
            }
            
            // adding (i+k)th element, incrementing count by 1
            map.put(nums[i+k], map.getOrDefault(nums[i+k], 0) + 1);
            
            // answer is highest key, assigning it to maxArr
            maxArr[maxArrInd] = map.lastKey();
            maxArrInd++;
        }
        
        return maxArr;
    }
}