// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        int n=arr.length;
        if(arr.length<=1 && arr[0]==0)
         return 0;
        if(arr[0]==0)
         return -1;
         
         int max=0;
         int stop=0;
         int jump=0;
         for(int i=0;i<n-1;i++)
         {
             max= Math.max(max , i+arr[i]);
             if(max>=n-1)
              {
                  jump++;
                  return jump;
              }
              if(i==stop)
              {
                  stop=max;
                  jump++;
              }
         }
         if(stop>=n-1)
         {
             return jump;
         }
         return -1;
         }
    }
