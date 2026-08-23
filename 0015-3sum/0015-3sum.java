import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> seen = new HashSet<>();
            int target = -nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    // sort triplet to avoid duplicates in different order
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
