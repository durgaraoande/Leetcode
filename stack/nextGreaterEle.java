package stack;

import java.util.Stack;

public class nextGreaterEle {
    public static int[] nextGreaterElement(int[] nums2) {
        int[] nge=new int[nums2.length];
        nge=nextGreater(nums2);
        return nge;
    }
    static int[] nextGreater(int[] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int nge[]=new int[n];
        for(int i=n*2-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
            nge[i%n]=(st.empty() == true)?-1:st.peek();}
            st.push(nums[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,4,3};
        
        for(int x:nextGreaterElement(nums1)){
            System.out.print(x+" ");
        }
    }
}
