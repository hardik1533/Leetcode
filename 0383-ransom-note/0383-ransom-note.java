// class Solution {
//     public boolean canConstruct(String r, String m) {
//         if(r.length() > m.length()) return false;

//         int[] freq = new int[26];

//         for(int i = 0; i < m.length(); i++){
//             if(i < r.length()) freq[r.charAt(i) - 'a']++;
//             freq[m.charAt(i) - 'a']--;
//         }

//         for(int i : freq){
//             if(i > 0) return false;
//         }

//         return true;
//     }
// }

//Optimal : 
class Solution {
    public boolean canConstruct(String r, String m) {
        if (r.length() > m.length()) return false;

        int[] freq = new int[26];

        // Count magazine letters
        for (char c : m.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check ransomNote letters
        for (char c : r.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) return false;
        }

        return true;
    }
}
