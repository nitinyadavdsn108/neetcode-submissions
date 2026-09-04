class Solution {
    public int trap(int[] nums) {

        //get the leftmost height
        // get the rightmost height
        // find the minmum among them
        // base will be = level - height[i];
        // width = left- right
    //     int trapped = 0;

    //     for(int i = 1 ; i < height.length-1 ; i++){
    //    /*      int left = i-1;
    //         int right = i+1;

            // while(left > 0 && height[left-1] > height[left]){
            //     left--;
            // }

            // while(right < height.length-1 && height[right+1] > height[right]){
            //     right++;
            // }
 

        //     int left = 0;
        //     for(int j=0 ; j < i ; j++){
        //         left = Math.max(left,height[j]);
        //     }

        //     int right = 0;
        //     for(int j =i+1 ; j < height.length ; j++){
        //         right = Math.max(right , height[j]);
        //     }


        //     int minHeight = Math.min(left, right);

        //     if(minHeight > height[i])
        //     trapped +=(minHeight-height[i]);


        // }
        // return trapped;    


             // aming two seperate arrays which will keep there tallest left and tallest
        // right
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
