// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int n: arr)
         sum+=n;
         
        if(sum%2!=0)
         return 0;
        
        sum/=2;
        
        boolean[][] dp= new boolean[N+1][sum+1];
        
        for(int i=0;i<=N;i++)
          Arrays.fill(dp[i] , false);
        
        boolean ans=checkSubset(arr,dp);
        if(ans==true)
         return 1;
        else
         return 0;
    }
  static boolean checkSubset(int[] arr, boolean[][]dp)
  {
      int n=dp.length;
      int m=dp[0].length;
      dp[0][0]= true;
      
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
             
            if(j==0)
               dp[i][j]=true;
             
              else if(i==0)
               dp[i][j]=false;
              

               
               else
               {
                   dp[i][j]=dp[i-1][j];
                   if(j>=arr[i-1])
                   {
                       dp[i][j]= (dp[i-1][j-arr[i-1]] || dp[i][j]);
                   }
               }
          }
      }
      return dp[n-1][m-1];
  }
}
