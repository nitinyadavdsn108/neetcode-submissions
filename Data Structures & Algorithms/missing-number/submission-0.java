class Solution {
    public int missingNumber(int[] nums) {
        int sums = 0;
        // finding sum of all elements
        for(int i = 0 ; i < nums.length ; i++){
            sums += nums[i];
        }
        int n = nums.length;
        int sums1 = 0;
        for(int i = 0 ; i <= n ; i++){
            sums1 += i;
        }

        return sums1-sums;
    }
}
