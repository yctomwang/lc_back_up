/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.20 %
    Runtime : 35 ms
    Memory Usage : 47.4 MB
    Testcase : 588 / 588 passed
    Ranking : 
        Your runtime beats 87.44 % of java submissions.
        Your memory usage beats 29.10 % of java submissions.
}
*/

class Solution {
    public int numSquares(int n) {
        //simlair to coin change
        
        //how to check if something is perfect square or not
        //
        
        List<Integer> perfect= new ArrayList<>();
        
        for(int i=n;i>0;i--){
            double sqr= Math.sqrt(i);
            if(sqr%1==0){
                //System.out.println(i);
                perfect.add(i);
            }
        }
        
        
        Queue<Integer> q = new LinkedList<>();
        
        boolean[] visited = new boolean[n+1];
        
        q.offer(n);
        visited[n]=true;
        int level=1;
        
        while(!q.isEmpty()){
            //visited[n]
            int qsize=q.size();
            
            for(int i=0;i<qsize;i++){
                int curr=q.poll();
                //System.out.println(curr);
                for(int j=0;j<perfect.size();j++){
                    int target=curr-perfect.get(j);
                    //System.out.println(target);
                    
                    if(target>=0&&target<=n&&visited[target]!=true){
                        //System.out.println("target"+target);
                        if(target==0){return level;}
                        q.offer(target);
                        visited[target]=true;
                    }
                    
                    
                    
                }
            }
            level++;
            
        }
        return level;
        
    }
}