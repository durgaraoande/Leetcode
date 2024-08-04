package stack;

import java.util.Stack;

public class Sum_of_subarray_mins {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int arr[]={3,1,2,4};
        System.out.println(sol.sumSubarrayMins(arr));;
    }
}
class Solution extends HelperMethod{
    public int sumSubarrayMins(int[] arr) {
        int mod=(int)(1e9 +7);
        long total=0;
        HelperMethod helper=new HelperMethod();
        int nse[]=helper.nextSmaller(arr);
        int pse[]=helper.prevSmaller(arr);
        for(int i=0;i<arr.length;i++){
            int left=i-pse[i];
            System.out.println(i);
            int right=nse[i]-i;
            total=(total+(long)(left*right*arr[i]))%mod;
        }
        return (int)total;
    }
}
class HelperMethod{
    public int[] nextSmaller(int[] arr){
        int nse[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        //while(!stack.isEmpty() && arr[stack.peek()]<=arr[i])//next greater
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]) {
            stack.pop();
        }
        nse[i]=(stack.empty()==true)?arr.length:stack.peek();
        stack.push(i);
        }
        return nse;
    }

    public int[] prevSmaller(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int pse[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stk.empty() && arr[stk.peek()] >=arr[i]){
                stk.pop();
            }
            pse[i]=(stk.empty()==true)?-1:stk.peek();
            stk.push(i);
        }
        return pse;
    }
}
//This is a brute force approach
        //this giving TLE
        // for(int i=0;i<arr.length;i++){
        //     int mini=arr[i];
        //     for(int j=i;j<arr.length;j++){
        //         mini=Math.min(mini,arr[j]);
        //         total=(total+mini)%mod;
        //     }
        // }
        // return total;
