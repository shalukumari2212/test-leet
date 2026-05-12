class Solution {
    class pair{
        int node,cost;
        pair(int node,int cost){
         this.node= node;
         this.cost= cost;
        }
    }

    class triplet{
        int node, price,stop;
        triplet(int node,int price,int stop){
            this.node= node;
            this.price= price;
            this.stop=stop;
        }

    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<pair>>adj= new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<flights.length;i++){
            int from= flights[i][0];
            int to= flights[i][1];
            int price= flights[i][2];
            adj.get(from).add(new pair(to,price));
        }

        int[] arr = new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[src]=0;

        PriorityQueue<triplet> pq= new PriorityQueue<>(
            (a,b) -> a.stop-b.stop
        );
        pq.add(new triplet(src,0,0));
        while(pq.size()>0){
            triplet front= pq.remove();

            if(front.stop==k+1) continue;
            for(pair p: adj.get(front.node)){
                int total= p.cost+ front.price;
                if(arr[p.node] > total){
                    arr[p.node] = total;
                    pq.add(new triplet(p.node,total,front.stop+1));
                }
            }
        }
        if(arr[dst]==Integer.MAX_VALUE) return -1;
        return arr[dst];
    
    }
}