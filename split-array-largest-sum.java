class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int n = nums.length;
        if (k > n) {
            return -1;
        }
        int high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int ans = findSum(nums, mid);
            if (ans <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int findSum(int nums[], int val) {
        int total = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (total + nums[i] <= val) {
                total += nums[i];

            } else {
                cnt++;
                total = nums[i];
            }
        }
        return cnt;
    }
}
