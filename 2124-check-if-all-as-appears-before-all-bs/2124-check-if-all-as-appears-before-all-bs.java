class Solution {
    public boolean checkString(String s) {
        boolean seenB = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true;
            } else if (seenB) { // c == 'a' after a 'b'
                return false;
            }
        }

        return true;
    }
}