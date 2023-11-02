package Stacks.question;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String x) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            switch (ch) {
                case '{', '(', '[' -> st.push(ch);
                case ']', '}', ')' -> {
                    if (!st.isEmpty()) {
                        char chx = st.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '(')) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.size() > 0) {
            return false;
        }
        return true;

    }
}
