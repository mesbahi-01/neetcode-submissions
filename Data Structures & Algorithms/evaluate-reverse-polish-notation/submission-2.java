class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> operands = new Stack<>();

        for (String token : tokens) {
            if (operators.contains(token)) {
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                
                int result = 0;
                if (token.equals("+")) {
                    result = operand1 + operand2;
                } else if (token.equals("-")) {
                    result = operand1 - operand2;
                } else if (token.equals("*")) {
                    result = operand1 * operand2;
                } else if (token.equals("/")) {
                    result = operand1 / operand2;
                }
                
                operands.push(result);
            } else {
                operands.push(Integer.parseInt(token));
            }
        }

        return !operands.isEmpty() ? operands.pop() : 0;
    }
}