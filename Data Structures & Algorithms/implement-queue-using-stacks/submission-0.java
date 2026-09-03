class MyQueue {
    int[] s1 = new int[100];
    int top1 = -1;
    int[] s2 = new int[100];
    int top2 = -1;

    // put element of s1 from the top into s2;

    public MyQueue() {

    }

    public void push(int x) {
        while(top2 != -1){
            top1++;
            s1[top1] = s2[top2];
            top2--;
        }

        if(top1 < 99){
            top1++;
            s1[top1] = x;
        }
    }

    public int pop() {

        if(top1==-1 && top2 == -1){
            // s1 and s2 both are empty
            return -1;
        }

        while(top1 != -1){
            top2++;
            s2[top2] = s1[top1];
            top1--;
        }
        return s2[top2--];
    }

    public int peek() {

         if(top1 == -1 && top2 == -1){
            return -1;
        }

        while(top1 != -1){
            top2++;
            s2[top2] = s1[top1];
            top1--;
        }
        return s2[top2];
    }

    public boolean empty() {
        if(top1 == -1 && top2 == -1){
            return true;
        }

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */