class MinStack {

    ArrayList<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {

        int min;

        if (stack.isEmpty()) {
            min = val;
        } else {
            min = Math.min(val, stack.get(stack.size() - 1)[1]);
        }

        stack.add(new int[]{val, min});
    }

    public void pop() {

        stack.remove(stack.size() - 1);
    }

    public int top() {

        return stack.get(stack.size() - 1)[0];
    }

    public int getMin() {

        return stack.get(stack.size() - 1)[1];
    }
}