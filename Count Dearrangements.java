/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] dp=new int[n+1];
		
		dp[1]=0;
		dp[2]=1;
		
		for(int i=3;i<n+1;i++)
		{
		    dp[i]= (i-1)*(dp[i-1] + dp[i-2]);
		}
		
		System.out.println(dp[n]);
	}
}

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
	
		
		int a=0;
		int b=1;
		
		for(int i=3;i<n+1;i++)
		{
		    int curr= (i-1)*(a+b);
		    a=b;
		    b=curr;
		}
		
		System.out.println(b);
	}
	}
