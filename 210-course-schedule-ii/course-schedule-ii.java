class Solution {
    public List<Integer> bfs(int n,int[] indegree,List<List<Integer>>adj){
        Queue<Integer>q = new LinkedList<>();
        List<Integer>ans= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(q.size()>0){
            int front= q.remove();
            ans.add(front);
            for(int ele: adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        return ans;
    }
    public int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
       for(int i=0;i<prerequisites.length;i++){
            int a= prerequisites[i][0];
            int b= prerequisites[i][1];
            adj.get(b).add(a);
        }
        //
        int[] indegree= new int[n];
        for(int i=0;i<n;i++){
            for(int ele : adj.get(i))
            indegree[ele]++;
        }

        List<Integer>ans= bfs(n,indegree,adj);
        // Collections.reverse(ans);
        if(ans.size() != n) return new int[0]; // cycle detech

        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]= ans.get(i);
        }
        return arr;
    }
}