// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution
{
    long countWays(int n,int k)
    {
        if(n==1)
         return k;
         
        long p=1000000007;
        
        long xxways= k%p;
        long xyways= k*(k-1)%p;
        
        for(int i=3;i<=n;i++)
        {
            long newxx= xyways;
            long newxy= ((xxways+xyways)*(k-1));
            
            xxways= newxx%p;
            xyways= newxy%p;
        }
        return (xxways+xyways)%p;
    }
}




// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}


  // } Driver Code Ends
