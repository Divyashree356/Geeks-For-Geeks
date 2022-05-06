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
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    public long countFriendsPairings(int n) 
    { 
       long[]dp= new long[n+1];
       Arrays.fill(dp , 0);
       long ans=getPairs(dp , n);
       
       ans%=1000000007;
       return ans;
    }
    
    private long getPairs(long[]dp ,int n)
    {
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=2;
    for(int i=0; i<=n ;i++)
    
    {
         if(i<=2)
        {
         dp[i] = i;
         continue;
        }
      
        long single= dp[i-1]%1000000007; 
        long pair  = dp[i-2]%1000000007;
        
        dp[i]= (single + pair*(i-1))%1000000007;
         
    }
       return dp[n];
    }
}    
 
