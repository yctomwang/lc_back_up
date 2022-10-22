/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 39.46 %
    Runtime : 30 ms
    Memory Usage : 61.2 MB
    Testcase : 162 / 162 passed
    Ranking : 
        Your runtime beats 41.50 % of java submissions.
        Your memory usage beats 81.41 % of java submissions.
}
*/

class Solution {
    int[][] dirs ={{0,1},{1,0},{-1,0},{0,-1}};
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
    List<Integer> answer = new ArrayList<>();
    //the current count
    DSU dsu = new DSU(m*n);
    int count =0;
    //defintion of island
    boolean[][] island = new boolean[m][n];
   
        
    for(int[] curr:positions){
    //there exists a peice of land
        if(island[curr[0]][curr[1]]==true){
            answer.add(count);
            continue;
        }
        island[curr[0]][curr[1]] = true;
        count++;
        for(int[] dir: dirs){
            int x= curr[0]+dir[0];
            int y= curr[1]+dir[1];
            //check out of bounds
            if(x<0||y<0||x>=m||y>=n||island[x][y]==false){
                continue;
            }
            int comp1= dsu.find(curr[0]*n+curr[1]);
            int comp2 = dsu.find(x*n+y);
            if(comp1!=comp2){
                dsu.union(comp1,comp2);
                count--;
            }
        }
        answer.add(count);
        
        
    }
    return answer;
    }
    
}

class DSU{
    int[] parent;

    public DSU(int n){
        //create parent list
        //set self's parent to self
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    
    public int find(int x){
        //one layer of pass compression
        // if(parent[x]==x) return x;
        //else return find(parent[x]);
        if(parent[x]!=x) parent[x]= find(parent[x]);
        return parent[x];
    }
    
    public void union(int x, int y){
        //3 ways of union
        //either by rank, or by number of nodes or whatever
        parent[find(x)]=find(y);
    }
}