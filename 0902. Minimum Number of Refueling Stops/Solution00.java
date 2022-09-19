/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 39.85 %
    Runtime : 4 ms
    Memory Usage : 49.2 MB
    Testcase : 198 / 198 passed
    Ranking : 
        Your runtime beats 87.13 % of java submissions.
        Your memory usage beats 36.25 % of java submissions.
}
*/

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        
        int distance =0;
        
        int fuel=startFuel;
        
        int stationidx=0;
        int answer=0;
        while(distance<target){
            
            
            if(fuel==0){
                if(!heap.isEmpty()){
                    fuel+=heap.poll();
                    answer++;
                }else if(heap.isEmpty()&&distance<target){
                    return -1;
                } 
            }
            
            distance+=fuel; fuel=0;
            
            
            //station[stationidx][0]= location
            //station[stationidx][1]= fuel
            
            while(stationidx<stations.length&&stations[stationidx][0]<=distance){
                heap.add(stations[stationidx][1]);
                stationidx++;
            }
            
            
        }
        
        return answer;
        
    }
}