/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.02 %
    Runtime : 46 ms
    Memory Usage : 68.1 MB
    Testcase : 56 / 56 passed
    Ranking : 
        Your runtime beats 5.22 % of java submissions.
        Your memory usage beats 8.98 % of java submissions.
}
*/

class Solution {
    public boolean canReach(int[] arr, int start) {
    //reach any index is a BFS problem
        
        Set<Integer> visited = new HashSet<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        
        if(arr[start]==0){
            return true;
        }
        queue.offer(start);
        visited.add(start);
        
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(arr[curr]==0) return true;
            //visit all neighbours
            if (curr + arr[curr] < arr.length)
                if(!visited.contains(curr+arr[curr])){
                    queue.add(curr + arr[curr]);
                    visited.add(curr+arr[curr]);
                }
                
            if (curr - arr[curr] >= 0)
                if(!visited.contains(curr-arr[curr])){
                    queue.add(curr - arr[curr]);
                    visited.add(curr-arr[curr]);
                }
                
        
        }
        
        return false;
        
    }
}