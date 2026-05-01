class Solution {
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row= row;
            this.col= col;
        }
    }
    public void bfs(int i,int j,char[][] grid,boolean[][] visit) {
         int m= grid.length;
        int n= grid[0].length;
        Queue<pair>q= new LinkedList<>();
        q.add(new pair(i,j));
        while(q.size()>0){
            pair front= q.remove();
            int row= front.row;
            int col= front.col;
            
            // top
            if(row>0){
                if(grid[row-1][col]=='1' && visit[row-1][col]==false  ){
                    q.add(new pair(row-1,col));
                    visit[row-1][col]= true;
                }
            }
            // down
            if(row+1<m){
                if(visit[row+1][col]==false && grid[row+1][col]=='1'){
                    q.add(new pair(row+1,col));
                    visit[row+1][col]= true;
                }
            }
            // left
            if(col>0){
                if(visit[row][col-1]==false && grid[row][col-1]=='1'){
                    q.add(new pair(row,col-1));
                    visit[row][col-1]= true;
                }
            }
            // right
            if(col+1<n){
                if(visit[row][col+1]==false && grid[row][col+1]=='1'){
                    q.add(new pair(row,col+1));
                    visit[row][col+1]= true;
                }
            }
        }

    }
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int count=0;
        boolean[][] visit= new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visit[i][j]==false && grid[i][j]=='1'){
                    bfs(i,j,grid,visit);
                    count++;
                }
            }
        }
        return count;
    }
}