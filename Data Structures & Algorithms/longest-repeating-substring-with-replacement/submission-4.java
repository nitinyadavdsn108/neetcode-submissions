class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add current character to count array
            count[s.charAt(right) - 'A']++;
            
            // Track the count of the most frequent character in the current window
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // Current window size is (right - left + 1)
            // If (window size - maxCount) > k, we have exceeded allowed replacements
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update global maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}