import java.util.*;

public class calculator {

    // Operator precedence
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/' || op == '%') return 2; // % same as * and /
        return -1;
    }

    // Apply operator on two values
    public static double applyOp(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero!");
                return a / b;
            case '%':
                if (b == 0) throw new ArithmeticException("Modulo by zero!");
                return a % b;
        }
        throw new IllegalArgumentException("Invalid operator: " + op);
    }

    // Balance parentheses automatically
    public static String balanceParentheses(String expr) {
        int open = 0, close = 0;
        for (char c : expr.toCharArray()) {
            if (c == '(') open++;
            else if (c == ')') close++;
        }

        // Add missing ')'
        while (open > close) {
            expr += ")";
            close++;
        }

        // Remove extra ')' at the end
        while (close > open && expr.endsWith(")")) {
            expr = expr.substring(0, expr.length() - 1);
            close--;
        }

        return expr;
    }

    // Evaluate expression
    public static double evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be empty!");
        }

        expression = balanceParentheses(expression);

        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Skip spaces
            if (c == ' ') continue;

            // Number (including decimals)
            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--; // step back
                values.push(Double.parseDouble(sb.toString()));
            }

            // Open parenthesis
            else if (c == '(') {
                ops.push(c);
            }

            // Close parenthesis
            else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    if (values.size() < 2) throw new IllegalArgumentException("Invalid expression!");
                    double b = values.pop();
                    double a = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(a, b, op));
                }
                if (ops.isEmpty() || ops.peek() != '(') throw new IllegalArgumentException("Mismatched parentheses!");
                ops.pop();
            }

            // Operator (+, -, *, /, %)
            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    if (values.size() < 2) throw new IllegalArgumentException("Invalid expression!");
                    double b = values.pop();
                    double a = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(a, b, op));
                }
                ops.push(c);
            }

            // Invalid input
            else {
                throw new IllegalArgumentException("Invalid character: " + c);
            }
        }

        // Apply remaining operations
        while (!ops.isEmpty()) {
            if (values.size() < 2) throw new IllegalArgumentException("Invalid expression!");
            double b = values.pop();
            double a = values.pop();
            char op = ops.pop();
            values.push(applyOp(a, b, op));
        }

        if (values.size() != 1) throw new IllegalArgumentException("Invalid expression!");

        return values.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lastResult = 0.0;
        boolean hasResult = false;

        System.out.println("=== Smart Calculator ===");
        System.out.println("Type 'exit' to quit.");
        System.out.println("Supports +, -, *, /, %, parentheses, and decimals.");
        System.out.println("If you start with an operator, it will use the last result.");
        System.out.println();

        while (true) {
            System.out.print("Enter expression: ");
            String expr = sc.nextLine().trim();

            if (expr.equalsIgnoreCase("exit")) break;

            try {
                // If user starts with operator, prepend last result
                if (hasResult && (expr.startsWith("+") || expr.startsWith("-") || expr.startsWith("*")
                        || expr.startsWith("/") || expr.startsWith("%"))) {
                    expr = lastResult + expr;
                }

                double result = evaluate(expr);
                System.out.println("Result: " + result);
                lastResult = result;
                hasResult = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Calculator closed.");
    }
}
