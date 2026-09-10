class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        boolean result = false;
        for (int i = 0, j = n - 1; (i < m); i++) {
            if (arr[i][j] < target) {
                // skip
            } else if (arr[i][j] > target) {
                result = binarySearch(arr, 0, j, i, target);
                if (result == true) {
                    return result;
                }
            } else if (arr[i][j] == target) {
                result = true;
                return result;
            }
        }
        return result;
    }

    public boolean binarySearch(int[][] arr, int start, int end, int row, int target) {
        int left = start;
        int right = end;
        int mid = left + right / 2;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[row][mid] < target) {
                left = mid + 1;

            } else if (arr[row][mid] > target) {
                right = mid - 1;

            } else {
                return true;
            }
        }
        return false;
    }
}
