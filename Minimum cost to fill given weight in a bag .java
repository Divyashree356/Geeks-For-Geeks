int minimumCost(int cost[], int n, int w) 
	{ 
        // Your code goes here
        long long dp[n+1][w+1] ;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(i==0) dp[i][j] = INT_MAX ;
                else if(j==0) dp[i][j] = 0 ;
                else if(cost[i-1] == -1) dp[i][j] = dp[i-1][j] ;
                else if(i<=j){
                    if(dp[i-1][j]>0)
                    dp[i][j] = min(cost[i-1]+dp[i][j-i],dp[i-1][j]) ; 
                    else dp[i][j] = cost[i-1]+dp[i][j-i] ; 
                }
                else{
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        return dp[n][w] == INT_MAX ? -1 : dp[n][w] ;
	} 
