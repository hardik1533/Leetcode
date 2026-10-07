class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // for(int i = 0; i < nums.length ; i++){
        //     if(nums[i] < min) min = nums[i];
        // }
        // return min;

        int i  = 0;
        int j = nums.length - 1;
        int ans = nums[0];

        while(i <= j){
            if(nums[i] < nums[j]) ans = Math.min(ans,nums[i]);
            int m = (i+j) / 2;
            ans = Math.min(nums[m] , ans);
            if(nums[i] <= nums[m]){
                i = m + 1;
            }else{
                j = m - 1;
            }
        }
        return ans;
    }
}