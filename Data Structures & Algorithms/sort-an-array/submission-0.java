class Solution {
    public int[] sortArray(int[] nums) {
        
        // i will use insertion sort
        for(int i = 0 ; i < nums.length ; i++){
            int j = i-1;
            int curr = nums[i];
            while(j>=0 && nums[j] > curr ){
                nums[j+1] =nums[j];
                j--;
            }
            nums[j+1] = curr;
        }

        return nums;
    }
}