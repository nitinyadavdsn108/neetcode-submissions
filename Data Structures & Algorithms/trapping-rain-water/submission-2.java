class Solution {
    public int trap(int[] nums) {

         int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int trapped = 0;

        for (int j = 0; j < nums.length; j++) {
            if (j == 0) {
                left[0] = nums[0];
            } else {

                left[j] = Math.max(nums[j], left[j - 1]);
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (j == nums.length - 1) {
                right[nums.length - 1] = nums[nums.length - 1];
            } else {

                right[j] = Math.max(nums[j], right[j + 1]);
            }
        }


        
        for (int i = 0; i < nums.length; i++) {
            int level = Math.min(left[i] , right[i])-nums[i];

            trapped += level;
            
        }

        return trapped;
       
    }
}
