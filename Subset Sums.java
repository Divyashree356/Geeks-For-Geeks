#GFG

class Solution{
    
    public void checkSums(ArrayList<Integer> arr , int n, ArrayList<Integer> ans ,int i , int sum )
    {
        if(i==n)
        {
            ans.add(sum);
            return;
        }
        
        checkSums(arr ,n , ans ,i+1 , sum + arr.get(i));
        checkSums(arr , n ,ans , i+1, sum);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        Collections.sort(arr);
    
    ArrayList<Integer> ans= new ArrayList<>();
       checkSums(arr , N ,ans,0 ,0 );
       return ans;
       
    }
}
