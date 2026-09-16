class Solution {
    public void moveZeroes(int[] nums) {
        // Brute :
        // int n = nums.length;
        // if(n <= 1) return;
        // int i = 0;
        // int j = i + 1;
        // while(i < n && j < n){

        //     if(nums[i] == 0){
        //         if(nums[j] == 0){
        //             j++;

        //         }else{
        //             nums[i] = nums[j];
        //             nums[j] = 0;
        //             i++;
        //         }

        //     }else {
        //         i++;
        //         if(nums[j] != 0) j++;
        //     }

        // }
        // return;

        // Optimal :
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) nums[count++] = nums[i];
        }

        while(count < nums.length) nums[count++] = 0;
        return;
    }
}