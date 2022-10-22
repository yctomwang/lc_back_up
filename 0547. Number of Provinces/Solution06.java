/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 63.25 %
    Runtime : 23 ms
    Memory Usage : 54.3 MB
    Testcase : 113 / 113 passed
    Ranking : 
        Your runtime beats 5.13 % of java submissions.
        Your memory usage beats 32.40 % of java submissions.
}
*/

class Solution {
    public int findCircleNum(int[][] isConnected) {
    int count=0;
    DSU dsu = new DSU(isConnected.length);
    for(int i=0;i<isConnected.length;i++){
        for(int j=0;j<isConnected[i].length;j++){
            //skip throough the self connected rubbish
            if(i==j) continue;
            if(isConnected[i][j]==1){
                dsu.union(i,j);
                
            }
            
        }
    }
    //a hash map to store, then return map.size()
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0;i<isConnected.length;i++){
        int curr =dsu.find(i);
        map.put(curr,map.getOrDefault(curr,0)+1);
    }
    
    
    return map.size();
    }
}

class DSU{
    int[] parent;
    public DSU(int n){
        parent=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
    }
    
    public int find(int x){
        if(parent[x]==x) return x;
        else return find(parent[x]);
    }
    
    public void union(int x, int y){
        //hook up x's parent with y
        parent[find(x)]= find(y);
    }
}