// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int maxCount = 0;
//         int curr = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {

//                 curr = 0;
//             } else {
//                 curr++;
//             }
//             maxCount = Math.max(maxCount, curr);
//         }
//         return maxCount;
//     }
// }

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // reset when 0 appears
            }
        }

        return maxCount;
    }
}
