/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 46.72 %
    Runtime : 44 ms
    Memory Usage : 67.1 MB
    Testcase : 66 / 66 passed
    Ranking : 
        Your runtime beats 23.88 % of java submissions.
        Your memory usage beats 13.50 % of java submissions.
}
*/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Convert from array to list first to make use of Collections.sort()
        List<Integer> sortedArr = new ArrayList<Integer>();
        for (int num: arr) {
            sortedArr.add(num);
        }
        
        // Sort using custom comparator
        Collections.sort(sortedArr, (num1, num2) -> Math.abs(num1 - x) - Math.abs(num2 - x));
        
        // Only take k elements
        sortedArr = sortedArr.subList(0, k);
        
        // Sort again to have output in ascending order
        Collections.sort(sortedArr);
        return sortedArr;
    }
}