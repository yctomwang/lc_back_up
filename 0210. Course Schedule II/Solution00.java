/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 47.91 %
    Runtime : 5 ms
    Memory Usage : 43.6 MB
    Testcase : 45 / 45 passed
    Ranking : 
        Your runtime beats 93.80 % of java submissions.
        Your memory usage beats 87.33 % of java submissions.
}
*/

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // global counter
        int count =0;
        int[] answer = new int[numCourses];
        //create graph
        Map<Integer,List<Integer>> graph = new HashMap<>();
        //create in degree array, can also use hashmap and etc
        int[] inDegree = new int[numCourses];
        
        
        for(int[] course_relation:prerequisites){
            int start= course_relation[1];
            int end = course_relation[0];
            graph.computeIfAbsent(start,x-> new ArrayList<>()).add(end);
            inDegree[end]++;
        }
        
        
        //find the entry to graph
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                
                answer[count]=i;
                count++;
                queue.offer(i);
            }
        }
        
        
        while(!queue.isEmpty()){
            int curr = queue.poll();
            //find all the neighbours of curr
            List<Integer> neighbour =graph.getOrDefault(curr,new ArrayList<>());
            for(int i=0;i<neighbour.size();i++){
                int currNei = neighbour.get(i);
                inDegree[currNei]--;
                if(inDegree[currNei]==0){
                    answer[count]=currNei;
                    count++;
                    queue.offer(currNei);
                }
            }
        }
        
        if(count==numCourses){return answer;}
        
        return new int[0];
        
    }
}