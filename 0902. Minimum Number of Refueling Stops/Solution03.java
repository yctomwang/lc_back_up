/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 39.85 %
    Runtime : 3 ms
    Memory Usage : 42.3 MB
    Testcase : 198 / 198 passed
    Ranking : 
        Your runtime beats 97.60 % of java submissions.
        Your memory usage beats 93.94 % of java submissions.
}
*/

class Solution {
    public int minRefuelStops(int t, int start, int[][] ss) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        int n = ss.length, idx = 0;
        int remain = start, location = 0, ans = 0;
        
        
        while(location<t){
            if(remain==0){
                if(!heap.isEmpty()){
                    remain+=heap.poll();
                    ans++;
                }else if(heap.isEmpty()&&location<t){
                    return -1;
                }
            }
            
            location+=remain; remain=0;
            //while we have not add all the fuel in gas station && and location of gas station is smaller our car's location
            while(idx<n&&ss[idx][0]<=location){
                heap.add(ss[idx][1]);
                idx++;
            }
            
        }
        
        return ans;
       
    }
}

