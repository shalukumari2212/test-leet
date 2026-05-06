class Solution {
    class pair{
        int node;
        double prob;
        pair(int node , double prob){
            this.node= node;
            this.prob= prob;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int end) {
        List<List<pair>>adj= new ArrayList<>();
        for(int i=0;i<n ;i++) adj.add( new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int a= edges[i][0];
            int b= edges[i][1];
            double c= succProb[i];
            adj.get(a).add(new pair(b,c));
            adj.get(b).add(new pair(a,c));
        }

        double[] prob= new double[n];
        Arrays.fill(prob,0.0);
        prob[src]=1.0;

        PriorityQueue<pair> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.prob, a.prob)
        );

        pq.add(new pair(src,1));
        while(pq.size()>0){
            pair front= pq.remove();
            int node= front.node;
            // double prob= front.prob;
            if(front.prob < prob[front.node]) continue;
            for(pair p: adj.get(node)){
                double totalProb= front.prob * p.prob;
                if(prob[p.node] < totalProb){
                    prob[p.node] = totalProb;
                    pq.add(new pair(p.node,totalProb));
                }
            }
        }
        return prob[end];
    }
}