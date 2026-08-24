class DynamicArray {
    // to point to the topmost element of array
    int top = -1;
    // defining the array globally
    int[] arr;
    // to get the size of array global variable size
    int size;


    public DynamicArray(int capacity) {
        arr = new int[capacity];
    }

    public int get(int i) {
       return arr[i];
    }

    public void set(int i, int n) {
        if( i>=0 && i<= top){
             arr[i] = n;
        }
    }

    public void pushback(int n) {
        size = arr.length;

        if(top == size-1){
            resize();
            top++;
            arr[top] = n;
        }else{

            top++;
            arr[top] = n;
        }
        
    

    }

    public int popback() {
        if(top != -1){
            return arr[top--];
        }
        return -1;
    }

    private void resize() {
        size = arr.length;
        size = 2*size;
       int[]  newArr = new int[size];

        for(int i = 0 ; i < arr.length ; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;

    }

    public int getSize() {
            return top+1;
    }

    public int getCapacity() {
        return arr.length;

    }
}
