class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while (left < right) {
            // width = distance btw ele
            // height = mi among the two

            // w = (right - left) ;
            // h = math.min(heights[left],heights[right]);

            int area = (right - left) * (Math.min(heights[left], heights[right]));

            max = Math.max(max, area);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        // int max = 0;

        // for (int i = 0; i < heights.length; i++) {
        //     for (int j = i + 1; j < heights.length; j++) {
        //         int area = (j - i) * (Math.min(heights[j], heights[i]));
        //         max = Math.max(max, area);
        //     }
        // }

         return max;
    }
}
