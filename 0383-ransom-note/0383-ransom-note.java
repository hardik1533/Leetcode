class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length() > m.length()) return false;

        int[] freq = new int[26];

        for(int i = 0; i < m.length(); i++){
            if(i < r.length()) freq[r.charAt(i) - 'a']++;
            freq[m.charAt(i) - 'a']--;
        }

        for(int i : freq){
            if(i > 0) return false;
        }

        return true;
    }
}