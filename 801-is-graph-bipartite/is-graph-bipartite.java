class Solution {
    static boolean ans;
    public void bfs(int i,int[][] adj,int[] visit){
        Queue<Integer>q= new LinkedList<>();
        visit[i]=0;
        q.add(i);
        while(q.size()>0){
            int front= q.remove();
            for(int ele : adj[front]){
                if(visit[ele] ==-1){
                    visit[ele] = 1-visit[front];
                    q.add(ele);
                }
                else if(visit[front]== visit[ele]){
                    ans= false; 
                    return;

                } 
            }
        }
       
    }
    public boolean isBipartite(int[][] adj) {
        ans= true;
        int n = adj.length;
        int []visit= new int[n];
        Arrays.fill(visit,-1);
        for(int i=0;i<n;i++){
            if(visit[i]==-1) bfs(i,adj,visit);

        }
        return ans;
    }
}