// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       int[] cuts={x,y,z};
       int[][] dp=new int[4][n+1];
       
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<n+1;j++)
           {
               if(i==0)
                {
                    dp[i][j]=Integer.MIN_VALUE;
                    continue;
                }
                if(j==0)
                {
                    dp[i][j]=0;
                    continue;
                }
                
                if(cuts[i-1]<=j)
                {
                    dp[i][j] =Math.max(dp[i-1][j] , dp[i][j-cuts[i-1]]+1);
                }
                else
                {
                    dp[i][j]= dp[i-1][j];
                }
           }
       
       }
       return dp[3][n]>0? dp[3][n]:0;
    }
}
