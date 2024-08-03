package stack;

import java.util.Stack;

public class No_NGE_right {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    // code here
    Stack<Integer> st=new Stack<>();
    int j=queries-1;
    int ans[]=new int[queries];
    for(int i=N-1;i>=0;i--){
        while(!st.empty() && st.peek()<=arr[i]){
            st.pop();
        }
        if(j>=0 && indices[j]==i){
            ans[j]=st.size();
            j--;
        }
        st.push(arr[i]);
        
        System.out.println(i+"---------");
        for(int x:st){
            System.out.println(x);
        }
        System.out.println("---------");
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]     = {3, 4, 2, 7, 5, 8, 10, 6};
       int queries = 2;
       int indices[] = {0, 5};
       for(int x:count_NGEs(arr.length, arr, queries, indices)){
        System.out.println(x);
       }
  }
}
