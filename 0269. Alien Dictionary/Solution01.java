/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 35.23 %
    Runtime : 8 ms
    Memory Usage : 43.1 MB
    Testcase : 127 / 127 passed
    Ranking : 
        Your runtime beats 55.99 % of java submissions.
        Your memory usage beats 28.76 % of java submissions.
}
*/

class Solution {
    Map<Character, List<Character>> graph = new HashMap<>();
    Map<Character, Integer> inDegree = new HashMap<>();
   
    
    public String alienOrder(String[] words) {
        //inital the indegree of everything to 0
        for(String word:words){
            for(char c: word.toCharArray()){
                inDegree.put(c,0);
                graph.put(c,new ArrayList<>());
            }
        }
        //grab every 2 words
        
        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2 = words[i+1];
            
            if(word1.length()>word2.length()&&word1.startsWith(word2)){
                
                return"";
            }
            //loop through every character and compare
            for(int j=0;j<Math.min(word1.length(),word2.length());j++){
                if(word1.charAt(j)!=word2.charAt(j)){
                    //add into dependency list
                    graph.get(word1.charAt(j)).add(word2.charAt(j));
                    inDegree.put(word2.charAt(j),inDegree.get(word2.charAt(j))+1);
                    break;
                    
                }
            }
        }
        
        
        
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        //find entry point
        for(char key: inDegree.keySet()){
            if(inDegree.get(key)==0){
                queue.add(key);
            sb.append(key);
            } 
        }
        
        
        while(!queue.isEmpty()){
            //into the queue we go
            char current = queue.poll();
            //all of current's neighbour indegree --
            //the getOrDefault is very important, if a character has no neighbour list
            //then ...
            //sb.append(current);
            for(char nei:graph.get(current)){
                inDegree.put(nei,inDegree.get(nei)-1);
                if(inDegree.get(nei)==0){
                    queue.add(nei);
                    sb.append(nei);
                } 
            }
            
            
        }
        
        if(sb.length()<inDegree.size()) return "";
        
        return sb.toString();
    
    }
    
    
    
}