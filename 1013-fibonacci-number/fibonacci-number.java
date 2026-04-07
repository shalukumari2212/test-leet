class Solution {
    public int fibo(int n ,int[]dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans = fibo(n-1,dp) + fibo(n-2,dp);
        dp[n]= ans;
        return ans;
    }
    public int fib(int n) {
     int[] dp = new int[n+1];
     return fibo(n,dp);



        // method 2  using recursion//
        // if(n<=1) return n;
        // return fib(n-1)+ fib(n-2);



        //   method 1  //

        // if(n==0) return 0;
        // if(n==1) return 1;
        // int num1=0;
        // int num2=1;
        // for(int i=2;i<=n;i++){
        //     int temp=num1+num2;
        //     num1=num2;
        //     num2=temp;
        // }
        // return num2;
    }
}