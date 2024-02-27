import java.util.ArrayList;
public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        int size=n+m;
        int i=0,j=0;
        int cnt=0;
        int ele=-1;
        while(i<n && j<m){
            if(arr1.get(i)<arr2.get(j)){
                if(cnt==k-1) {return arr1.get(i);}
                cnt++;
                i++;
            }
            else{
                if(cnt==k-1){ return arr2.get(j);}
                cnt++;
                j++;
            }
        }
        while(i<n){
            if(cnt==k-1) return arr1.get(i);
                cnt++;
                i++;
        }
        while(j<m){
            if(cnt==k-1){ return arr2.get(j);}
                cnt++;
                j++;
        }
        return 0;
    }
}
