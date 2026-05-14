class Solution {
    class triplet{
        int node,parent,dist;
        triplet(int node,int parent,int dist){
            this.node= node;
            this.parent= parent;
            this.dist= dist;

        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n= points.length;
        boolean[] visit= new boolean[n];
        PriorityQueue<triplet>pq= new PriorityQueue<>(
            (a,b) -> a.dist-b.dist
        );
        pq.add(new triplet(0,-2,0));
        int sum=0;

        while(pq.size()>0){
            triplet top= pq.remove();
            int node= top.node, parent= top.parent , dist= top.dist;
             if(visit[node]==true) continue;
            visit[node]= true;
            sum+= dist;
            for(int i=0;i<n;i++){
                if(i==node || i==parent) continue;
                if(visit[i]==true) continue;
                int x1= points[node][0];
                int y1= points[node][1];
                int x2= points[i][0];
                int y2= points[i][1];
                int mdist= Math.abs(x2-x1) + Math.abs(y2-y1);
                pq.add(new triplet(i,node,mdist));
            }
        }
        return sum;

       

    }
}