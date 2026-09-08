class Solution {
    public int evalRPN(String[] tokens) {
        int[] st = new int[tokens.length];
        int top = -1;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int l = st[top--];
                int r = st[top--];
                st[++top] = l + r;
            } else if (tokens[i].equals("-")) {
                int l = st[top--];
                int r = st[top--];
                st[++top] = r - l;
            } else if (tokens[i].equals("*")) {
                int l = st[top--];
                int r = st[top--];
                st[++top] = r * l;
            } else if (tokens[i].equals("/")) {
                int l = st[top--];
                int r = st[top--];
                st[++top] = r / l;
            } else {
                st[++top] = Integer.parseInt(tokens[i]);
            }
        }
        return st[top];
    }
}
