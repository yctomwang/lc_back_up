/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.38 %
    Runtime : 7 ms
    Memory Usage : 48.2 MB
    Testcase : 275 / 275 passed
    Ranking : 
        Your runtime beats 86.15 % of java submissions.
        Your memory usage beats 63.77 % of java submissions.
}
*/

class Solution {
    public int[] asteroidCollision(int[] ast) {
        //
        //List<Integer> answer = new ArrayList<>();
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<ast.length;i++){
            if(ast[i]>0){
                //System.out.println(ast[i]);
                stack.addLast(ast[i]);
            }
            else{
                // 3cases we need to consider, bigger than, equal, and smaller
                while(!stack.isEmpty()&&(Math.abs(ast[i])>stack.peekLast())&&stack.peekLast()>0){
                    stack.removeLast();
                }
                if(!stack.isEmpty()&&stack.peekLast()==Math.abs(ast[i])){
                    stack.removeLast();
                }
                else if(stack.isEmpty()==true||stack.peekLast()<0){
                    stack.addLast(ast[i]);
                }
            }
        }
        int[] answer = new int[stack.size()];
        int k=0;
        for(int a: stack){
            answer[k]=a;
            k++;
        }
        // Foo[] array = new Foo[answer.size()];
        // list.toArray(array); // fill the array

        return answer;
    }
}