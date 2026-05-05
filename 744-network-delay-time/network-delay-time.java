class Solution {
    class pair{
        int node,dist;
        pair(int node,int dist){
            this.node=node;
            this.dist= dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<pair>> adj= new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int a= times[i][0];
            int b= times[i][1];
            int c= times[i][2];
         
            adj.get(a).add(new pair(b, c));
        }

        // distant array bnao
        int [] dist= new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
       
 
        PriorityQueue<pair>q= new PriorityQueue<>(
            (a,b) -> a.dist- b.dist
        );

        q.add(new pair(k,0));

        while(q.size()>0){
            pair front= q.remove();
            int node = front.node;
            int d= front.dist;
            for(pair p:adj.get(node)){
                int totaldist=  p.dist+ d;
                if(dist[p.node] > totaldist){
                    dist[p.node] = totaldist;
                    q.add(new pair(p.node,totaldist));
                }

            }
                
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            else ans= Math.max(ans,dist[i]);
        }
        return ans;
    }
}