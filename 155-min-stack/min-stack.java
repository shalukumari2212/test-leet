class MinStack {
    Stack<Integer>st= new Stack<>();
    Stack<Integer>ans= new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
         st.push(val);
         ans.push(val);
        } 
        else{
            st.push(val);
            if(val<ans.peek()) ans.push(val);
            else ans.push(ans.peek());
        }
        
    }
    
    public void pop() {
        st.pop();
        ans.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return ans.peek();
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