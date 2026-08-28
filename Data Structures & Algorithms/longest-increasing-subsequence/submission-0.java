class Solution {
    public int lengthOfLIS(int[] nums) {
    
            int[] dp = new int[nums.length];
        int max = 0 ;

        // intially all elements are given value one
        for(int i = 0 ; i < nums.length ; i++){

            dp[i] = 1;

            for(int j=0 ; j < i ; j++){
                // only if the previous element is less then current ith element
                if(nums[j] < nums[i]){                    
                dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }

            max = Math.max(max,dp[i]);
        }

        return max;
     
    

           }
}
