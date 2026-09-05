class Solution {
    public int numRescueBoats(int[] people, int limit) {
        insertionSort(people);

        int left = 0;
        int right = people.length - 1;
        int boatCount = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boatCount++;
        }

        return boatCount;
    }

    static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int curr = nums[i];

            while (j >= 0 && curr < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = curr;
        }
    }
}