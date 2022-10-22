/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.34 %
    Runtime : 25 ms
    Memory Usage : 48.5 MB
    Testcase : 52 / 52 passed
    Ranking : 
        Your runtime beats 19.05 % of java submissions.
        Your memory usage beats 40.52 % of java submissions.
}
*/

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //create hashmap for grap
        Map<Integer, List<Integer>> graph = new HashMap<>();
        //create indegree
        int[] inDegree = new int[numCourses];
        
        int count=0;
        
        for(int[] edge:prerequisites ){
            int end= edge[0];
            int start= edge[1];
            List<Integer> l1 = graph.getOrDefault(start,new ArrayList<>());
            l1.add(end);
            graph.put(start,l1);
            
            //graph.computeIfAbsent(start,x-> new ArrayList<>()).add(end);
            //increase the indegree of the course that requires prereq
            inDegree[end]++;
        }
        
        Queue<Integer> queue= new LinkedList<>();
        
        //BFS based on indegree
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                queue.offer(i);
                
            }
        }
        
        while(!queue.isEmpty()){
            int curr=queue.poll();
            count++;
            for(int nei:graph.getOrDefault(curr,new ArrayList<>())){
                inDegree[nei]--;
                if(inDegree[nei]==0){
                    queue.offer(nei);
                }
            }
        }
        
        if(count==numCourses) return true;
        return false;
    }
}