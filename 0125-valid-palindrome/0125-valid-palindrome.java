// class Solution {
//     public boolean isPalindrome(String s) {
//         String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         int i = 0;
//         int j = s1.length() -1;
//         while(i < j){
//             if(s1.charAt(i) != s1.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

//2nd Solution
class Solution {
   public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while(i < j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9')){
                if((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9')){
                    if(a != b){
                        return false;
                    }
                    i++;
                    j--;
                }else j--;
            }else i++;
        }
        return true;
    }
}
