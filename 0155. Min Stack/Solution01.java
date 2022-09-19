/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.48 %
    Runtime : 4 ms
    Memory Usage : 44.1 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 98.01 % of java submissions.
        Your memory usage beats 95.69 % of java submissions.
}
*/

class MinStack {
    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> min;
    int minval= Integer.MAX_VALUE;
    
    
    public MinStack() {
        stack = new ArrayDeque<>();
        min= new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.addLast(val);
       if(val<=minval){
           min.addLast(val);
           minval=val;
       }else{
           min.addLast(minval);
       }
        // if(min.isEmpty()||val<=min.peekLast()){
        //     min.addLast(val);
        // }
        //System.out.println(min.toString());
    }
    
    public void pop() {
         stack.removeLast();
        min.removeLast();
        if(!min.isEmpty())minval=min.peekLast();
        else{minval=Integer.MAX_VALUE;}
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
       return min.peekLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */