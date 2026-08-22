// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> arr = new ArrayList<>();

//         for (int i : nums1) {
//             set.add(i);
//         }

//         for (int i : nums2) {
//             if (set.contains(i)) {
//                 arr.add(i);
//                 set.remove(i); // remove to avoid duplicates
//             }
//         }

//         // Convert ArrayList<Integer> -> int[]
//         int[] ans = new int[arr.size()];

//         for (int i = 0; i < arr.size(); i++) {
//             ans[i] = arr.get(i); // unboxing Integer -> int
//         }

//         return ans;
//     }
// }

//Optimal : 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1) set1.add(x);

        Set<Integer> res = new HashSet<>();
        for (int y : nums2) {
            if (set1.contains(y)) res.add(y);
        }

        // Convert Set<Integer> -> int[]
        int[] ans = new int[res.size()];
        int i = 0;
        for (int v : res) ans[i++] = v;
        return ans;
    }
}
