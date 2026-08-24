class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26]; // freq of s1
        int[] window = new int[26];  // freq of current window in s2

        // fill s1 freq
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int len = s1.length();

        // first window
        for (int i = 0; i < len; i++) {
            window[s2.charAt(i) - 'a']++;
        }

        if (matches(s1Count, window)) return true;

        // slide window
        for (int i = len; i < s2.length(); i++) {
            window[s2.charAt(i) - 'a']++;               // add new char
            window[s2.charAt(i - len) - 'a']--;         // remove old char

            if (matches(s1Count, window)) return true;  // check
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
