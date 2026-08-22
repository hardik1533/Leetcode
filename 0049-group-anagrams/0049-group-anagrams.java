import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // frequency array for 26 lowercase letters
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // build key from frequency array
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append((char)(i + 'a')).append(count[i]);
                }
            }
            String key = sb.toString();

            // group words by key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
