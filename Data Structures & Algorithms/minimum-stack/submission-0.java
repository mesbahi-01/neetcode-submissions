class MinStack {
    int[] vlaues;
    int index;
    public MinStack() {
        vlaues = new int[100];
        index = -1;
    }
    
    public void push(int val) {
        index++;
        vlaues[index] = val;
    }
    
    public void pop() {
        index--;
    }
    
    public int top() {
        return vlaues[index];
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= index; i++) {
            if (min > vlaues[i]) {
                min = vlaues[i];
            }
        }
        return min;
    }
}