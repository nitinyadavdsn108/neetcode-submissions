class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int maxLen = Math.max(n1, n2);

        for (int i = 0; i < maxLen; i++) {
            // If characters are left in word1, append one
            if (i < n1) {
                result.append(word1.charAt(i));
            }
            // If characters are left in word2, append one
            if (i < n2) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}