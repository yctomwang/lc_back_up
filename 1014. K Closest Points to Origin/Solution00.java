/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.91 %
    Runtime : 44 ms
    Memory Usage : 118.5 MB
    Testcase : 87 / 87 passed
    Ranking : 
        Your runtime beats 66.37 % of java submissions.
        Your memory usage beats 27.85 % of java submissions.
}
*/

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //kth smallest number
        //List<int[]> answer= new ArrayList<>();
        //(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
            
            
            //(b[0]-0)^2+(b[1]-0)^2))-(((a[0]-0)^2+a[1]-0)^2)));
        
        int n = points.length;
        //kth  smallest
        
        for(int i=0;i<n;i++){
            
            heap.add(points[i]);
            if(heap.size()>k){
                heap.poll();
            }
            
        }
        
        int[][] answer  = new int[k][2];
      
        
        for(int i=0;i<k;i++){
            answer[i]=heap.poll();
        }
        return answer;
        
    }
}