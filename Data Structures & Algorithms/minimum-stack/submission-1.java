class MinStack {
    int[] values;
    int[] minStack;
    int index;

    public MinStack() {
        values = new int[100];
        minStack = new int[100];
        index = -1;
    }

    public void push(int val) {
        index++;
        values[index] = val;
        calculateMin();
    }

    private void calculateMin() {
        if (index == 0) {
            minStack[index] = values[index];
        } else if (values[index] < minStack[index - 1]) {
            minStack[index] = values[index];
        } else {
            minStack[index] = minStack[index - 1];
        }
    }

    public void pop() {
        index--;
    }

    public int top() {
        return values[index];
    }

    public int getMin() {
        return minStack[index];
    }
}