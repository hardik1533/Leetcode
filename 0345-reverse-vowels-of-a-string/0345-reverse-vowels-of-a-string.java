class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] ans = s.toCharArray();

        while (i < j) {
            char a = ans[i];
            char b = ans[j];
            if ((a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I'
                    || a == 'O' || a == 'U')) {
                if ((b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I'
                        || b == 'O' || b == 'U')) {
                    char temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                    i++;
                    j--;
                }
                else
                    j--;
            }else i++;
        }

        return new String(ans);

    }
}