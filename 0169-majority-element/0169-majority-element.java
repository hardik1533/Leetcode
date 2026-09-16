import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Update frequency
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Check majority condition
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        // By problem guarantee, majority element always exists
        return nums[0];
    }
}
