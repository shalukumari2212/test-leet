class Solution {
    class triplet{
        int row;
        int col;
        int effort;

        triplet(int row,int col,int effort){
            this.row= row;
            this.col= col;
            this.effort=effort;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n= heights.length;
        int m = heights[0].length;
        
        int [][] arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) arr[i][j] = Integer.MAX_VALUE; 
        }
        arr[0][0] =0;

        PriorityQueue<triplet> pq= new PriorityQueue<>(
            (a,b) -> a.effort - b.effort
        );

        pq.add(new triplet(0,0,0));

        while(pq.size()>0){
            triplet front= pq.remove();
            int row = front.row , col= front.col , effort= front.effort;

            if(row>0){
                int totaleffort= Math.abs(heights[row-1][col] -heights[row][col] );
                totaleffort= Math.max(totaleffort,effort);
                if(arr[row-1][col] > totaleffort){
                    arr[row-1][col] = totaleffort;
                    pq.add(new triplet(row-1 , col, totaleffort));
                }
            }
            if(col>0){
                int totaleffort= Math.abs(heights[row][col-1] -heights[row][col] );
                totaleffort= Math.max(totaleffort,effort);
                if(arr[row][col-1] > totaleffort){
                    arr[row][col-1] = totaleffort;
                    pq.add(new triplet(row , col-1, totaleffort));
                }
            }
             if(row<n-1){
                int totaleffort= Math.abs(heights[row+1][col] -heights[row][col]  );
                totaleffort= Math.max(totaleffort,effort);
                if(arr[row+1][col] > totaleffort){
                    arr[row+1][col] = totaleffort;
                    pq.add(new triplet(row+1 , col, totaleffort));
                }
            }
            if(col<m-1){
                int totaleffort= Math.abs(heights[row][col+1] -heights[row][col] );
                totaleffort= Math.max(totaleffort,effort);
                if(arr[row][col+1] > totaleffort){
                    arr[row][col+1] = totaleffort;
                    pq.add(new triplet(row , col+1, totaleffort));
                }
            }
        }

        return arr[n-1][m-1];
    }
}