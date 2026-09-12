class Solution {
   public int[] dailyTemperatures(int[] nums) {
        int[] res = new int[nums.length];
        int[] st = new int[nums.length];
        int top = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (top == -1) {
                st[++top] = i;
                res[i] = 0;
            }
            if (nums[st[top]] <= nums[i]){

                while (top >= 0 && nums[st[top]] <= nums[i]) {
                    top--;
                }
                st[++top] = i;
                if (top == 0) {
                    res[i] = 0;
    
                } else {
                    res[i] = st[top-1] - i;
                }
            }
            if (nums[st[top]] > nums[i]) {
                res[i] = st[top] - i;
                st[++top] = i;
            }

        }

        return res;
    }
}
