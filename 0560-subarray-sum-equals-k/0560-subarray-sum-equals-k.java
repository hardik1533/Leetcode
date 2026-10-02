// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;
//         for(int i = 0; i < nums.length; i++){
//             int sum = 0;
//             for(int  j = i; j < nums.length; j++){ 
//                 sum += nums[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: sum = k at start

        for (int num : nums) {
            sum += num;

            // if (sum - k) exists, add its frequency
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // update frequency of current sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
