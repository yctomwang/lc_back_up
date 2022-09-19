/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.40 %
    Runtime : 6 ms
    Memory Usage : 42.7 MB
    Testcase : 68 / 68 passed
    Ranking : 
        Your runtime beats 35.89 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public String smallestSubsequence(String s) {
        //a hashmap that stores the when a character last occurs
        HashMap<Character, Integer> map = new HashMap<>();
        for(int c=0;c<s.length();c++){
            map.put(s.charAt(c),c);
        }
        
        HashSet<Character> used = new HashSet<>();
        
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for(int i =0;i<s.length();i++){
            //while stack is not empty and mantain increasing stack
            //ensure its not the last occurence
            while(!stack.isEmpty()&&s.charAt(i)<stack.peekLast()&&i<map.get(stack.peekLast())&&!used.contains(s.charAt(i))){
                //stack.removeLast();
                used.remove(stack.removeLast());
            }
            
            //into the stack
            if(!used.contains(s.charAt(i))){
                 stack.addLast(s.charAt(i));
            used.add(s.charAt(i));
            }
            // stack.addLast(s.charAt(i));
            // used.add(s.charAt(i));
        }
        
        //System.out.println(stack.toString());
        StringBuilder s1= new StringBuilder();
        
        for(char b: stack){
            s1.append(b);
        }
        return s1.toString();
        
    }
}