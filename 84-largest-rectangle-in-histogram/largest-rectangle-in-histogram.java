class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        Stack<Integer>st= new Stack<>();
        int[] nsn= new int[n];
        int[] psn= new int[n];
        nsn[n-1]= n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) nsn[i]=n;
            else nsn[i]= st.peek();
            st.push(i);
        }

        while(!st.isEmpty())st.pop();

        psn[0]=-1;
        st.push(0);
        for(int i=1;i<=n-1;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0) psn[i]=-1;
            else psn[i]=st.peek();

            st.push(i);
        }

        int max=0;       
        for(int i=0;i<=n-1;i++){
          int area=  heights[i] * (nsn[i]-psn[i]-1);
         max= Math.max(max,area);
        }
        return max;
    }
}