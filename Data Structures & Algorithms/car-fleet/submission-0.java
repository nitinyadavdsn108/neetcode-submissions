class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // first find the corresponding time it will take for each and store it in 2d array

        double[][] car = new double[position.length][2];
        for (int i = 0; i < speed.length; i++) {
           double  t1 = (double) (target - position[i]) / speed[i];
            car[i][0] = (double) position[i];
            car[i][1] = t1;
        }
        Arrays.sort(car, (a, b) -> Double.compare(b[0], a[0]));
        int top = -1;
        double[] st = new double[position.length];

        for (int i = 0; i < speed.length; i++) {
            if (top == -1) {
                st[++top] = car[i][1];
            }
            else if(car[i][1]<=st[top]){
                // dont push it considered as same fleet
            }else if(car[i][1]>st[top])
            {
                st[++top] = car[i][1];
            }
        }


        return top+1;
    }
        void quicksort(int[] arr, int start, int end) {
            if (start >= end)
                return;

            int pivot = partition(arr, start, end);
            quicksort(arr, start, pivot - 1);
            quicksort(arr, pivot, end);
        }

        int partition(int[] arr, int start, int end) {
            int pivot = arr[start];
            int i = start;
            int j = end;
            while (i <= j) {
                while (i <= end && arr[i] > pivot) {
                    i++;
                }

                while (j >= start && arr[j] < pivot) {
                    j--;
                }
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }
            }

            return i;
        }
    }
