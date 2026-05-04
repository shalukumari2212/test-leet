class Solution {
    public void bfs(int i ,int[][] adj, boolean[]isVisit) {
        int n = adj.length;
        isVisit[i] = true;
        Queue<Integer> q= new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front = q.remove();
            for(int j=0;j<n;j++){
                if(adj[front][j] == 1 && !isVisit[j]){
                    q.add(j);
                    isVisit[j] = true;
                }

            }
        }
        return;
    }
    public void dfs(int i ,int[][] adj, boolean[]isVisit) {
       isVisit[i]= true;
       for(int j=0;j<adj.length;j++){
        if(!isVisit[j] && adj[i][j]==1){
            dfs(j,adj,isVisit);
        }
       } 

    }
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count=0;
        boolean[]isVisit = new boolean[n];
        // for(int i=0;i<n;i++){
        //     if(isVisit[i]==false){
        //         bfs(i,adj,isVisit);
        //         count++;
        //     }
        // } 
         for(int i=0;i<n;i++){
            if(isVisit[i]==false){
                dfs(i,adj,isVisit);
                count++;
            }
        }
        return count;
    }
}