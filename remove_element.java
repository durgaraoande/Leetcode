class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<n){
            if(nums[i]==val){
                nums[i]=nums[j];
                j--;
                n--;
                i--;
            }
            else{
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}
