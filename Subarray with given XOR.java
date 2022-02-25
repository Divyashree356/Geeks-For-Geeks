//INTREVIEW_BIT

public class Solution {
    public int solve(int[] A, int B) {
        HashMap <Integer , Integer>  mp = new HashMap<Integer , Integer>();
        int cnt=0;
        int xorr= 0;

        for(int i=0;i<A.length;i++)
        {
            xorr=xorr^A[i];

             if(mp.get(xorr^B)!=null)
            cnt+=mp.get(xorr^B);

            if(xorr==B)
             cnt++;

          
        if(mp.get(xorr)!=null)
         mp.put(xorr , mp.get(xorr)+1);

        else
         mp.put(xorr , 1);

        }
        return cnt;

    }
}
