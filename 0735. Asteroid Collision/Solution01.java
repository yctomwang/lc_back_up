/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.38 %
    Runtime : 17 ms
    Memory Usage : 47.8 MB
    Testcase : 275 / 275 passed
    Ranking : 
        Your runtime beats 21.74 % of java submissions.
        Your memory usage beats 76.89 % of java submissions.
}
*/

class Solution {
    public int[] asteroidCollision(int[] ast) {
        //
        //List<Integer> answer = new ArrayList<>();
        
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<ast.length;i++){
            if(ast[i]>0){
                //System.out.println(ast[i]);
                stack.push(ast[i]);
            }
            else{
                // 3cases we need to consider, bigger than, equal, and smaller
                while(!stack.isEmpty()&&(Math.abs(ast[i])>stack.peek())&&stack.peek()>0){
                    stack.pop();
                }
                if(!stack.isEmpty()&&stack.peek()==Math.abs(ast[i])){
                    stack.pop();
                }
                else if(stack.isEmpty()==true||stack.peek()<0){
                    stack.push(ast[i]);
                }
            }
        }
        int[] answer = new int[stack.size()];
        int k=0;
        for(int a: stack){
            answer[k]=a;
            k++;
        }
        

        return answer;
    }
}