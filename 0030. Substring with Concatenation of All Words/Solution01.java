/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 30.79 %
    Runtime : 438 ms
    Memory Usage : 144.8 MB
    Testcase : 178 / 178 passed
    Ranking : 
        Your runtime beats 12.78 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        //check for corner case
        
        
        Map<String, Integer> map = new HashMap<>();
        
        //how many words we have
        int n= words.length;
        
        //length of each word
        int m = words[0].length();
        
        for(int c=0; c<n;c++){
           map.put(words[c],map.getOrDefault(words[c],0)+1);
        }
        //System.out.println(map.toString());
        
        //now we loop through the whole string
        
        
        for(int i=0;i<=s.length()-n*m;i++){
            //we neeed to check that each substring
            //check ith, i+mth all the way upto i+nth
            Map<String, Integer> copy= new HashMap<>(map);
            int legal =n;
            for(int j=i;j<i+n*m;j+=m){
                //check j to j+m-1
                
                //int legal =n;
                
                if(copy.getOrDefault(s.substring(j,j+m),0)>0){
                    copy.put(s.substring(j,j+m),copy.getOrDefault(s.substring(j,j+m),0)-1);
                    legal--;
                }
                
                if(legal==0){answer.add(i);
                             //System.out.println(answer.toString());
                            }
                    
                
            }
            
        }
        
        return answer;
    }
}