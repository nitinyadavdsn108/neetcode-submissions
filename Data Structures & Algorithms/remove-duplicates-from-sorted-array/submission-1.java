class Solution {
    public int removeDuplicates(int[] nums) {
        // two pointer approach right but how
        // hard code the first value of array diectly into new unique arr

        int index = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[index-1]){
                nums[index++] = nums[i];
            }
        }
        
        return index;     
    }
}