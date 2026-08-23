// class Solution {
//     public boolean validPalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1;
//         int k = 0;

//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 if (k == 0) {
//                     if (s.charAt(i + 1) == s.charAt(j)) {

//                         i++;
//                         k++;
//                     } else if (s.charAt(i) == s.charAt(j - 1)) {
//                         j--;
//                         k++;
//                     } else
//                         return false;
//                 } else
//                     return false;

//             } else {
//                 i++;
//                 j--;
//             }
//         }
//         return true;
//     }
// }

//Optimal : 

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Skip either left or right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
