// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int[][] dp= new int[n][m];
        //   Arrays.fill(dp ,-1);
        // Memoization calling
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int temp=goldMine(i , 0 , M , dp);
             if(temp>ans)
                ans=temp;
        }
        return ans;
    }
  static int goldMine(int i , int j , int[][] grid , int[][] dp)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length)
          return 0;

        if(dp[i][j]!=0)
         return dp[i][j];

        int op1 = goldMine(i-1 , j+1 ,grid , dp );
        int op2 = goldMine( i , j+1 ,grid , dp );
        int op3 = goldMine(i+1 , j+1 ,grid , dp );

        int max = Math.max(op1 , Math.max(op2 , op3));
        
        dp[i][j]=max+grid[i][j];

        return dp[i][j];

    }
}
