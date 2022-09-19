/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 36.43 %
    Runtime : 118 ms
    Memory Usage : 44.2 MB
    Testcase : 50 / 50 passed
    Ranking : 
        Your runtime beats 71.64 % of java submissions.
        Your memory usage beats 93.32 % of java submissions.
}
*/

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int answer =1;
        //loop through wordList to check if endword is in it or not
        //then determine what we want to do
        //create a set of wordList
        Set<String> set1 = new HashSet<>(wordList);
        if(!set1.contains(endWord)){
            return 0;
        }
        Queue<String> q1 = new LinkedList<>();
        int wordL= beginWord.length();
        q1.offer(beginWord);
        
        while(!q1.isEmpty()){
            int qsize=q1.size();
            for(int i=0;i<qsize;i++){
                String current = q1.poll();
                if(current.equals(endWord)){
                    return answer;
                }
                for(int j=0;j<wordL;j++){
                    for(char letter ='a';letter<='z';letter++){
                        StringBuilder nextString = new StringBuilder(current);
                        nextString.setCharAt(j,letter);
                        String nextWord = nextString.toString();
                        if(set1.contains(nextWord)){
                            set1.remove(nextWord);
                            q1.offer(nextWord);
                        }
                    }
                   
                }
                
                
                
            }
            answer++;
            
            
            
        }
        
        return 0;
        
    }
}