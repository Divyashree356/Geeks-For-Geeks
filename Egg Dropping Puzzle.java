// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}


// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    int[][] dp= new int[n+1][k+1];
	    for(int i=0;i<=n;i++)
	     Arrays.fill(dp[i], -1);
	    
	    return solve(n,k , dp);
	}
	
	
	
	
	//memoizaton
	static int solve(int egg , int floor , int[][] dp)
	{
	    if(floor==1 || floor==0 || egg==1)
	     return floor;
	     
	     if(dp[egg][floor]!=-1)
	      return dp[egg][floor];
	      
	      int mn= Integer.MAX_VALUE;
	      for(int k=1;k<=floor;k++)
	      {
	          int temp=1+ Math.max(solve(egg-1, k-1,dp) , solve(egg, floor-k,dp));
	          
	          mn=Math.min(mn ,temp);
	      }
	      return dp[egg][floor]=mn;
	}
	
//recursive
// 	static int solve(int egg , int floor)
// 	{
// 	    if(egg==1)
// 	     return floor;
// 	    if(floor==1 || floor==0)
// 	     return floor;
	     
// 	    int mn =Integer.MAX_VALUE;
// 	    for(int k=1;k<=floor;k++)
// 	    {
// 	        int temp= 1+ Math.max(solve(egg-1, k-1), solve(egg, floor-k));
// 	        mn= Math.min(mn , temp);
// 	    }
// 	    return mn;
// 	}
}
