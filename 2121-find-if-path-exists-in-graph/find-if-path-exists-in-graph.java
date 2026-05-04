class Solution {
    public void bfs(int i,List<List<Integer>>adj,boolean[] visit ) {
       
        Queue<Integer> q= new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front= q.remove();
            for(int ele : adj.get(front)){
                if(!visit[ele]){
                    visit[ele]= true;
                    q.add(ele);
                }
            }

            
        }
       return;
    }
    public void dfs(int i,List<List<Integer>>adj,boolean[] visit ) {
        visit[i]=true;
        for(int ele: adj.get(i)){
            if(!visit[ele]) dfs(ele,adj,visit);
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<edges.length ;i++){
            int a= edges[i][0];
            int b= edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean []visit = new boolean[n];

        visit[destination] =true;

        // bfs(destination ,adj,visit );
        dfs(destination ,adj,visit );
        if(visit[source] == true) return true;
        return false;

    }
}