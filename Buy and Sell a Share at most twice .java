// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends



class Solution {
    public static int maxProfit(int n, int[] price) {
        
        int[] dpl= new int[n];
        int maxSP=0;
        int minBP=price[0];
        
        for(int i=1;i<n;i++)
        {
            if(minBP > price[i])
             minBP=price[i];
             
             maxSP= price[i]-minBP;
             
             if(maxSP>dpl[i-1])
              dpl[i]=maxSP;
             else
              dpl[i]=dpl[i-1];
        }
        
        int maxBP=price[n-1];
        int maxP=0;
        int[] dpr= new int[n];
        
        for(int i=n-2;i>=0;i--)
        {
         if(maxBP<price[i])
          maxBP= price[i];
          
         maxP= maxBP-price[i];
         
         if(maxP > dpr[i+1])
          dpr[i]=maxP;
         else
          dpr[i]=dpr[i+1];
        }
        
        int profit=0;
        for(int i=0;i<n;i++)
          profit= Math.max(profit , dpr[i]+dpl[i]);
        
        return profit;
    }
}
        
