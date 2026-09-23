class Solution {
    public boolean isValid(String s) {
        int[] st = new int[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                st[++top] = s.charAt(i);
            } 
            else {
                // If stack is empty when a closing bracket appears, string is invalid
                if (top == -1) {
                    return false;
                }

                if (st[top] == '[' && s.charAt(i) == ']') {
                    top--;
                } 
                else if (st[top] == '(' && s.charAt(i) == ')') {
                    top--;
                } 
                else if (st[top] == '{' && s.charAt(i) == '}') {
                    top--;
                } 
                else {
                    return false; // Mismatched brackets
                }
            }

        }

        return top == -1;
    }
}