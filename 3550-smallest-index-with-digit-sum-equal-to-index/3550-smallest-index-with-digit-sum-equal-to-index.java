class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == i && nums[i] < 10) return i;
            else if(nums[i] > 9){
                int sum = 0;
                int temp = nums[i];
                while(temp > 0){
                    sum += temp % 10;
                    temp /= 10;
                }
                if(sum == i) return i;
            }
        }
        return -1;
    }
}