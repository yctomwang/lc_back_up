/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.46 %
    Runtime : 322 ms
    Memory Usage : 118.2 MB
    Testcase : 48 / 48 passed
    Ranking : 
        Your runtime beats 44.42 % of java submissions.
        Your memory usage beats 29.58 % of java submissions.
}
*/

class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> deadset= new HashSet<>();
        
        //use a hashset to dealwith
        for(String s: deadends){
            if(!deadset.contains(s)){
                deadset.add(s);
            }
        }
        HashSet<String> visited = new HashSet<>();
        
        
        
        Queue<String> q= new LinkedList<>();
        
        String start="0000";
        if(deadset.contains(start)){
            return -1;
        }
        if(start.equals(target)){
            return 0;
        }
        q.offer(start);
        visited.add(start);
        
        int depth=1;
        while(!q.isEmpty()){
            int qsize=q.size();
            
            for(int j=0;j<qsize;j++){
                 String curr= q.poll();
                StringBuilder s1= new StringBuilder(curr);
                for(int i=0;i<4;i++){
                    char currPos=s1.charAt(i);
                    String new1=s1.substring(0,i)+(currPos=='9'?0:currPos-'0'+1)+s1.substring(i+1);
                    String new2=s1.substring(0,i)+(currPos=='0'?9:currPos-'0'-1)+s1.substring(i+1);
                    if(!deadset.contains(new1)&&!visited.contains(new1)){
                        if(new1.equals(target)){
                            return depth;
                        }
                        q.offer(new1);
                        visited.add(new1);
                    }
                    if(!deadset.contains(new2)&&!visited.contains(new2)){
                        if(new2.equals(target)){
                            return depth;
                        }
                        q.offer(new2);
                        visited.add(new2);
                }
                
            }
            }
            
            
           
            
            depth++;
        }
        
        
        return -1;
        
        
        //Starting from 0000, we can search for states 1000,2000
    }
}