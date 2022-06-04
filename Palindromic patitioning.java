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
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static int palindromicPartition(String s)
    {
        int[][] dp= new int[s.length()][s.length()];
        
        for(int i=0;i<s.length();i++)
         Arrays.fill(dp[i] , -1);
         
        return solve(s, 0 , s.length()-1 , dp);
    }
    static int solve(String s, int i,int j, int[][]dp)
    {
        if(i>=j)
         return 0;
         
        if(isPalindrome(s, i , j))
         return 0;
         
        if(dp[i][j]!=-1)
          return dp[i][j];
         
         int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int temp=1+ solve(s,i , k,dp ) + solve(s, k+1 ,j,dp);
            
            ans =Math.min(ans , temp);
        }
        return dp[i][j]=ans;
    }
    
    static boolean isPalindrome(String s, int i , int j)
    {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
              {
                  return false;
              }
             i++;
             j--;
        }
        return true;
    }
    
    
}
