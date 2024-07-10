class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // if(n==1){
        //     return nums[0];
        // }
        // for(int i:nums){
        //     if(!map.containsKey(i)){
        //         map.put(i,1);
        //     }else{
        //         map.put(i,map.get(i)+1);
        //         if(map.get(i)>n/2){
        //             return i;
        //         }
        //     }
        // }
        // return -1;
        int ele=nums[0];
            int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ele){
                cnt++;
            }
            else{
                cnt--;
                if(cnt==0){
                    ele=nums[i];
                    cnt=1;
                }
            }
        }
        return ele;
    }
}
