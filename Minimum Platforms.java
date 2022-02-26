
//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1, j=0;
        int platform =1 , res=1;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                platform++;
                i++;
            }
            else if(arr[i]>dep[j])
            {
                j++;
                platform--;
            }
            if(res<platform)
             res=platform;
        }
        return res;
    }
    
}

