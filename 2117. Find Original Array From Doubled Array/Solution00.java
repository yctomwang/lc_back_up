/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 41.09 %
    Runtime : 194 ms
    Memory Usage : 151.5 MB
    Testcase : 178 / 178 passed
    Ranking : 
        Your runtime beats 51.02 % of java submissions.
        Your memory usage beats 5.87 % of java submissions.
}
*/

class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        Map<Integer, Integer> freq = new HashMap<>();
        // Store the frequency in the map
        for (int num : changed) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int[] original= new int[changed.length / 2];
        int index = 0;
        for (int num : changed) {
            // If element exists
            if (freq.get(num) > 0) {
				freq.put(num, freq.get(num) - 1);
                int twiceNum = num * 2;
                if (freq.containsKey(twiceNum) && freq.get(twiceNum) > 0) {
                    // Pair up the elements, decrement the count
                    freq.put(twiceNum, freq.get(twiceNum) - 1);
                    // Add the original number to answer
                    original[index++] = num;
                } else {
                    return new int[0];
                }
            }
        }
        
        return original;
        
    }
}