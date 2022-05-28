// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().smallestSumSubarray(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int smallestSumSubarray(int arr[], int size)
    {
        int sum=0;
        int minSum= Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++)
        {
            sum= Math.min(arr[i] , sum+arr[i]);
            
            if(minSum>sum)
             minSum=sum;
        }
        return minSum;
    }
}
