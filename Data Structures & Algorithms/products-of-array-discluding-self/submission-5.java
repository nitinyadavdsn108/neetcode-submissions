class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // cannot go out of creed
        int pro = 1;
        int zeroCount = 0;

        for (int i : nums) {
            if (i == 0) {
                zeroCount++;
            } else {
                pro *= i;
            }
        }

        if (zeroCount > 1) {
            return result;
        }

        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result[i] = pro;
                    return result;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = pro / nums[i];
        }

        return result;
    }
}
