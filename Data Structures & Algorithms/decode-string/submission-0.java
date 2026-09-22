
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(currNum);
                strStack.push(currStr);
                currNum = 0;
                currStr = new StringBuilder();
            } else if (c == ']') {
                int num = numStack.pop();
                StringBuilder prevStr = strStack.pop();
                
                for (int i = 0; i < num; i++) {
                    prevStr.append(currStr);
                }
                currStr = prevStr;
            } else {
                currStr.append(c);
            }
        }

        return currStr.toString();
    }
}






