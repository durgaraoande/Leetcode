class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long total=0;
        
        for(int i=0;i<n;i++){
        int mini=nums[i];
        int maxi=nums[i];
            for(int j=i;j<n;j++){
                mini=Math.min(mini,nums[j]);
                maxi=Math.max(maxi,nums[j]);
                total+=(maxi-mini);
            }
        }
        return total;
    }
}

