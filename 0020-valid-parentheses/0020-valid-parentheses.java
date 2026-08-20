import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // Agar stack empty hai -> invalid
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                // Matching check
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Agar stack empty hai -> valid
        return stack.isEmpty();
    }
}
