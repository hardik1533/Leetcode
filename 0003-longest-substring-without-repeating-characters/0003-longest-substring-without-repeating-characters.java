// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         //    Brute :
//         // Set<Character> set = new HashSet<>();
//         // int n = s.length();
//         // int max = 0;
//         // if(n == 1) return 1;
//         // for(int i = 0; i < n; i++){
//         //     for(int j = i; j < n; j++){
//         //         if(!set.contains(s.charAt(j))){
//         //             set.add(s.charAt(j));
//         //         }else{
//         //             if(set.size() > max) max = set.size();
//         //             set.clear();
//         //             break;
//         //         }
//         //     }
//         // }
//         // return max;

//         // Optimal : 
//         Set<Character> set = new HashSet<>();
//         int l = 0;
//         int maxL = 0;
//         for (int r = 0; r < s.length(); r++) {
//             while (set.contains(s.charAt(r))) {
//                 set.remove(s.charAt(l));
//                 l++;
//             }
//             set.add(s.charAt(r));
//             maxL = ((r - l + 1) > maxL) ? (r - l + 1) : maxL;
//         }
//         return maxL;
//     }
// }

//Optimal : 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, max = 0;

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
