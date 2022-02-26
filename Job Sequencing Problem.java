//GFG
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr , (a,b)->(b.profit-a.profit));
        
        int maxDeadline=0;
        for(int i=0;i<n;i++)
        {
            if(maxDeadline<arr[i].deadline)
            {
             maxDeadline=arr[i].deadline;   
            }
        }
        
        int maxProfit=0 , totalJobs=0;
        int[] profitArr= new int[maxDeadline+1];
        Arrays.fill(profitArr , -1);
        
        for(int i=0;i<n;i++)
        {
            for(int j=arr[i].deadline ; j>0;j--)
            {
                if(profitArr[j]==-1)
                {
                    profitArr[j]=i;
                    maxProfit  =maxProfit +  arr[i].profit;
                    totalJobs++;
                    break;
                }
            }
        }
        int[] ans= new int[2];
        ans[0]=totalJobs;
        ans[1]=maxProfit;
        return ans;
    }
}
