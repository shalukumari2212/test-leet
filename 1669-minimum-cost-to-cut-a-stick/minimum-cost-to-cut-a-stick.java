class Solution {
    public int cost(int i ,int j, int[]arr,int[][]dp){
        if(i>j) return 0;
        if(dp[i][j]!= -1) return dp[i][j];
        int min= Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int l= arr[j+1] - arr[i-1];
            int totalcost = cost(i,k-1,arr,dp) + cost(k+1,j,arr,dp)+l;
            min= Math.min(min,totalcost);

        }
        return dp[i][j]=min;
    }
    public int minCost(int n, int[] cuts) {
        int len= cuts.length;
        int m= len+2;

        int[] cut = new int[m];
        cut[0]=0;
        cut[m-1]=n;
        for(int i=1;i<m-1;i++){
            cut[i]= cuts[i-1];           
        }
        Arrays.sort(cut);
        int[][] dp= new int[m-1][m-1];
        for(int i=0;i<m-1;i++){
            for(int j=0;j<m-1;j++){
                dp[i][j]=-1;
            }
        }
        
        return cost(1,m-2,cut,dp);
    }
}