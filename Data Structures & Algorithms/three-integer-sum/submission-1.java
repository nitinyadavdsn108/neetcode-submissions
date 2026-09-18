class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> triplets = new ArrayList<>();

        /* triplets.add(Arrays.asList(2,3,5));
       System.out.println(triplets.toString());
      // int[] rr = {2,3,5};
       if(triplets.contains(Arrays.asList(2,3,5))){
           System.out.println("yyes");
       }
*/

        Arrays.sort(a);

        // brute-approach
      
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i + 1; j < a.length; j++) {
        //         for (int z = j + 1; z < a.length; z++) {
        //             if (a[i] + a[j] + a[z] == 0) {
        //                 if (!triplets.contains(Arrays.asList(a[i], a[j], a[z]))) {
        //                     triplets.add(Arrays.asList(a[i], a[j], a[z]));
        //                 }
        //             }
        //         }
        //     }
        // }

        // for (int i = 0; i < a.length-2; i++) {
        //     int left = i + 1;
        //     int right = a.length - 1;
        //     int sum = a[i] + a[left] + a[right];
        //     while (left < right) {
        //         while(sum<0 && left<right){
        //             sum = a[i] + a[left] + a[right];
        //             left++;   
        //         }
        //         while(sum>0 && left<right){
        //             sum = a[i] + a[left] + a[right];
        //             right--;
        //         }

        //         if(sum == 0){
        //             if(!triplets.contains(Arrays.asList(a[i],a[left],a[right]))){
        //                 triplets.add(Arrays.asList(a[i],a[left],a[right]));
        //             }
        //         }

        //         left++;
        //         right--;
        //     }
        // }/

    
    for (int i = 0; i < a.length - 2; i++) {
        // 2. Skip duplicate elements for 'i' to avoid duplicate triplets
        if (i > 0 && a[i] == a[i - 1]) {
            continue;
        }
        
        int left = i + 1;
        int right = a.length - 1;
        
        while (left < right) {
            int sum = a[i] + a[left] + a[right];
            
            if (sum == 0) {
                triplets.add(Arrays.asList(a[i], a[left], a[right]));
                
                // 3. Skip duplicates for 'left' and 'right' 
                while (left < right && a[left] == a[left + 1]) left++;
                while (left < right && a[right] == a[right - 1]) right--;
                
                // Move pointers inward after finding a match
                left++;
                right--;
            } else if (sum < 0) {
                left++; // Sum is too small, move left pointer up
            } else {
                right--; // Sum is too large, move right pointer down
            }
        }
    }
    

        return triplets;
    }
}
