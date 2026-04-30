class Solution {
    public void bfs(int i, List<List<Integer>> adj ,boolean[] isVisited ) {
        Queue<Integer> q= new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front= q.remove();
            for(int ele: adj.get(front)){
                if(!isVisited[ele]){
                    isVisited[ele]= true;
                    q.add(ele);
                }
            }
        }
        return;
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n= adj.size();
        boolean [] isVisited= new boolean[n];
        isVisited[0] = true;
        bfs(0,adj,isVisited);
        for(boolean ele : isVisited){
            if(ele== false) return false;
        }
        return true;
    }
}