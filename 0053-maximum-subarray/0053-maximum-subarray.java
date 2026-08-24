class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length == 1) return nums[0];
        // int maxsum = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     int tempsum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         tempsum = tempsum + nums[j];
        //             if(tempsum > maxsum ) maxsum = tempsum;
        //     }
        // }
        // return maxsum;

        int curSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(curSum < 0) curSum = 0;
            curSum += nums[i];
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}