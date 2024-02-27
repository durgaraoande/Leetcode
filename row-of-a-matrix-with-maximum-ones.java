import java.util.ArrayList;
public class Solution
{
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int ones=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=matrix.get(i).get(j);
            }
            if(sum>ones){
                ones=sum;
                ans=i;
            }
        }
        return ans;
    }
}
