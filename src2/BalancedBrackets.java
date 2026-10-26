/**
 * Sami Yusuf Aktaş
 * 250444045
 * 26.10.2026
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                // opening bracket -> push
                stack.push(c);

            } else if (c == ')' || c == ']' || c == '}') {
                // closing bracket, but nothing is open -> not balanced
                if (stack.isEmpty()) {
                    return false;
                }

                // the most recently opened bracket must match this one
                char opening = stack.pop();
                if (!isMatchingPair(opening, c)) {
                    return false;
                }
            }
            // any other character (letters, digits...) is ignored
        }

        // balanced only if no opening bracket is left unclosed
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }

        // Check: [ matches ]
        if (opening == '[' && closing == ']') {
            return true;
        }

        // Check: { matches }
        if (opening == '{' && closing == '}') {
            return true;
        }

        // no match
        return false;
    }
}