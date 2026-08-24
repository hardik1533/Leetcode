class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     int a = 1;
        //     for(int j = 0; j < nums.length; j++){
        //             if(nums[j] == nums[i]) continue;
        //             a = a * nums[j];
        //     }
        //     ans[i] = a;
        // }
        // return ans;

        // int n = nums.length;
        // int prefix[] = new int[n];
        // int suffix[] = new int[n];
        // int ans[] = new int[n];
        
        // prefix[0] = nums[0];
        // for(int i = 1; i < n; i++){
        //     prefix[i] = prefix[i - 1] * nums[i];
        // }

        //  suffix[ n - 1] = nums[n - 1];
        // for(int i = n - 2; i >= 0; i--){
        //     suffix[i] = suffix[ i + 1] * nums[i];
        // }

        // ans[0] = suffix[1];
        // ans[n - 1] = prefix[n - 2];
        // for(int i = 1; i < n - 1; i++){
        //     ans[i] = prefix[i - 1] * suffix[i + 1];
        // }
        // return ans;
 
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: suffix products (multiply in reverse)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
       
    }
}