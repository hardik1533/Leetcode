class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                arr.add(i);
                set.remove(i); // remove to avoid duplicates
            }
        }

        // Convert ArrayList<Integer> -> int[]
        int[] ans = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i); // unboxing Integer -> int
        }

        return ans;
    }
}
