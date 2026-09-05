class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int[] tmp = new int[k];

        int ind = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            tmp[ind++] = nums[i];
        }

        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < tmp.length; i++) {
            nums[i] = tmp[i];
        }
    }
}