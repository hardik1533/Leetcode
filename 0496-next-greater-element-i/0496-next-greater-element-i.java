// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums2.length - 1; i++) {
//             if (nums2[i] < nums2[i + 1]) {
//                 map.put(nums2[i], nums2[i + 1]);
//             }
//         }

//         int[] ans = new int[nums1.length];

//         for (int i = 0; i < nums1.length; i++) {
//             ans[i] = map.getOrDefault(nums1[i], -1);

//         }
//         return ans;
//     }
// }

//Optimal : 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        // Traverse nums2 and build mapping
        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        // Prepare answer for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}
