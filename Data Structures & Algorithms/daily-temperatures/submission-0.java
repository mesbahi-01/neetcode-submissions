class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int index = i + 1;

            while (index < n) {
                if (temperatures[i] < temperatures[index]) {
                    break;
                } else {
                    index++;
                }
            }

            if (index == n) {
                index = i;
            }

            result[i] = index - i;
        }

        return result;
    }
}