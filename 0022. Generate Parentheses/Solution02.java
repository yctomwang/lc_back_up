/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 71.52 %
    Runtime : 5 ms
    Memory Usage : 44 MB
    Testcase : 8 / 8 passed
    Ranking : 
        Your runtime beats 21.72 % of java submissions.
        Your memory usage beats 33.22 % of java submissions.
}
*/

class Solution {
    List<String> answer = new ArrayList<>();
    //String temp = new String(); 
    int number=0;
    public List<String> generateParenthesis(int n) {
        //int total=n*2;
        number =n;
        
        char left='(';
        char right = ')';
        
        List<Character> options= new LinkedList<>();
        options.add(left);
        options.add(right);
        
        backTrack(new StringBuilder(),0,0,options);
        return answer;
    }
    
    public void backTrack(StringBuilder temp, int numLeft, int numRight, List<Character> options){
        if(numRight>numLeft){
            return;
        }
        if(numRight>number||numLeft>number){
            return;
        }
        if(numLeft==number&&numRight==number){
            answer.add(temp.toString());;
            return;
        }
        
        for(int i=0;i<options.size();i++){
            //make a choice
            temp.append(options.get(i));
            if(i==1){
                numRight+=1;
            }
            else{numLeft+=1;}
            
            backTrack(temp,numLeft, numRight, options);
            
            temp.deleteCharAt(temp.length() - 1);
            if(i==1){
                numRight-=1;
            }
            else{numLeft-=1;}
        }
        
    }
}