// class Solution {
//     public int minOperations(int[] nums, int x) {
//         int i = 0, n = nums.length, j = n - 1, temp = x, op = 0;

//         while(i <= j && temp > 0){
//             if(nums[i] > temp && nums[j] > temp) return -1;

//             if(nums[i] > nums[j] && nums[i] <= temp){
//                 temp -= nums[i];
//                 i++;
//                 op++;
//             }else if(temp >= nums[j]){
//                 temp -= nums[j];
//                 j--;
//                 op++;
//             }

//             // temp = (nums[i] > nums[j] && nums[i] <= temp) ?  temp - nums[i] : temp - nums[j];
//             // op++;
//             // i++;
//             // j--;
//         }
    
//         return (temp > 0) ? -1 : op;
//     }
// }
//Optimal : 
class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) total += num;

        int target = total - x;
        if (target < 0) return -1;  // not possible
        if (target == 0) return n;  // remove all elements

        int sum = 0, left = 0, maxLen = -1;
        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum > target) {
                sum -= nums[left++];
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return (maxLen == -1) ? -1 : n - maxLen;
    }
}
