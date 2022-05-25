// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String S) {
          
	    int csum=0;
	    int msum=0;
	    
	    for(int i=0;i<S.length();i++)
	    {
	        int val=0;
	        if(S.charAt(i)=='0')
	          val++;
	         
	        else if(S.charAt(i)=='1')
	           val--;
	         
	        if(csum>0)
	          csum+=val;
	         else
	          csum=val;
	       
	       if(msum<csum)
	        msum=csum;
	    }
	    if(msum==0)
	     return -1 ;
	     
	     return msum;
	
    }
}
