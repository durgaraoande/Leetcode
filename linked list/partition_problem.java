import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        return findPages(boards, boards.size(), k);
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n){
            return -1;
        }
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)>low){
                low=arr.get(i);
            }
            high+=arr.get(i);
        }

        while(low<=high){
            int mid=(low+high)/2;
            int count=findCount(arr,mid);
            if(count<=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    public static int findCount(ArrayList<Integer> arr,int pages){
        int stu=1;
        int stupages=0;
        for(int i=0;i<arr.size();i++){
            if(stupages+arr.get(i)<=pages){
                stupages+=arr.get(i);
            }
            else{
                stu++;
                stupages=arr.get(i);
            }
        }
        return stu;
    }
}
