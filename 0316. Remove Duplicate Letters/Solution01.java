/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.35 %
    Runtime : 11 ms
    Memory Usage : 43.4 MB
    Testcase : 290 / 290 passed
    Ranking : 
        Your runtime beats 15.17 % of java submissions.
        Your memory usage beats 19.26 % of java submissions.
}
*/

class Solution {
    public String removeDuplicateLetters(String s) {
        //if montonic, good
        //if not we need to check if stack.peek() is where it occurred the last time
        HashMap<Character, Integer> occur = new HashMap<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        HashSet<Character> seen = new HashSet<>();
        //populate the map right
        for(int j=0;j<s.length();j++){
            occur.put(s.charAt(j),j);
        }
        
        for(int i=0;i<s.length();i++){
            while(!stack.isEmpty()&&s.charAt(i)<stack.peekLast()&&i<occur.get(stack.peekLast())&&!seen.contains(s.charAt(i))){
                seen.remove(stack.removeLast());
            }
            if(!seen.contains(s.charAt(i))){
                stack.addLast(s.charAt(i));
                seen.add(s.charAt(i));
            }
            }
        //System.out.println(stack.toString());
        StringBuilder s1= new StringBuilder();
        for(char a: stack){
            s1.append(a);
        }
        
        return s1.toString();
            
    }
}