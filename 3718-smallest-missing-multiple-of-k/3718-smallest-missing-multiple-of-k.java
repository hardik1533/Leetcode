class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int i = 1; i <= nums.length + 1; i++){
            if(!set.contains(i * k)){
                return i * k;
            }
        }

        return k;
    }
}