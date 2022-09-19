/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 41.29 %
    Runtime : 66 ms
    Memory Usage : 57.8 MB
    Testcase : 189 / 189 passed
    Ranking : 
        Your runtime beats 18.50 % of java submissions.
        Your memory usage beats 14.45 % of java submissions.
}
*/

class Solution {
    public int coinChange(int[] coins, int amount) {
        //check for edge case
        
        if(amount<1){return 0;}
        
        Queue<Integer> q = new LinkedList<>();
        
        //an array to store visited states aka numbers
        boolean [] visited = new boolean[amount+1];
        
        q.offer(amount);
        visited[amount]=true;
        int step =1;
        //the meaning of the queue are visited statments, but we are yet to visit their neighours
        while(!q.isEmpty()){
            int qsize=q.size();
                
            for(int i=0;i<qsize;i++){
                int curr = q.poll();
                // if(curr==0){
                //     return step-1;
                // }
                for(int c:coins){
                    int newamount = curr-c;
                    if(newamount>=0&&newamount<=amount&&visited[newamount]==false){
                        if(newamount==0) return step;
                        q.offer(newamount);
                        visited[newamount]=true;
                    }
                    
                }
            }
            
            step++;
                        
            
        }
        
        
        
        return -1;
    }
}