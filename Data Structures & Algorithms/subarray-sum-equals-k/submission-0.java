class Solution {
    public int subarraySum(int[] a, int k) {
        List<Integer> res = new ArrayList<>();
        int n = a.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = i;
            sum = 0;

            while (i < n) {
                sum += a[i];
                if (sum == k) {
                    count++;
                }
                i++;
            }

            i = temp;
        }

        return count;
    }
}