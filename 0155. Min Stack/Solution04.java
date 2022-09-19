/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.48 %
    Runtime : 9 ms
    Memory Usage : 48.3 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 47.04 % of java submissions.
        Your memory usage beats 62.11 % of java submissions.
}
*/

class MinStack {
    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> min;
    
    
    public MinStack() {
        stack = new ArrayDeque<>();
        min= new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.addLast(val);
       
        if(min.isEmpty()||val<=min.peekLast()){
            min.addLast(val);
        }
        //System.out.println(min.toString());
    }
    
    public void pop() {
         int val = stack.removeLast();
        if(min.peekLast()==val) min.removeLast();
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