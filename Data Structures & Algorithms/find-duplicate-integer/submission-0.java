class Solution {
    public int findDuplicate(int[] nums) {
        int[] seen = new int[nums.length];
        for(int i =0 ; i < nums.length ; i++){
            seen[nums[i]]++;
        }

        for(int j = 0 ; j < nums.length ; j++){
            if(seen[nums[j]] > 1 ){
                return nums[j];
            }
        }

        return nums[0];
    }
}
