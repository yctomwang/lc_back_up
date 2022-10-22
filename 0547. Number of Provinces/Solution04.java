/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.25 %
    Runtime : 13 ms
    Memory Usage : 54.4 MB
    Testcase : 113 / 113 passed
    Ranking : 
        Your runtime beats 10.56 % of java submissions.
        Your memory usage beats 20.32 % of java submissions.
}
*/

class Solution {
    public int findCircleNum(int[][] isConnected) {
    boolean[]  visited = new boolean[isConnected.length];
    int count=0;
    //loop through the adjancy edges
    for(int i=0;i<isConnected.length;i++){
        if(visited[i]==false) count++;
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(i);
        visited[i]= true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int j=0;j<isConnected[curr].length;j++){
                if(curr!=j){
                    int curr2= isConnected[curr][j];
                    if(curr2==1){
                        //System.out.println("hello");
                        if(!visited[j]){
                           queue.offer(j);
                        visited[j]=true; 
                        }
                        
                    }
                }
                
            }
        }
        
    }
    
    
    
    return count;
    }
}