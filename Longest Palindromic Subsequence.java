// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        String rev="";
        for(int i=0;i<S.length();i++)
        {   char c= S.charAt(i);
            rev=c+rev;
        }
         return getSub(S, rev , S.length());
    }
    
    public int getSub(String s, String r, int n)
    {
        int[][] dp= new int[n+1][n+1];
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                 if(i==0)
                  dp[i][j]=0;
                 
                 else if(j==0)
                  dp[i][j]=0;
                  
                  else if(s.charAt(i-1)==r.charAt(j-1))
                  {
                      dp[i][j]= 1+dp[i-1][j-1];
                  }
                  else
                  {
                      dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]);
                  }
            }
        }
        return dp[n][n];
    }
}
