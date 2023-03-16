package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double calculate(int number, String opt) {
        if (opt.equals("rvs")) {
            return 1.0 / number;
        }
        return Math.sqrt(number);
    }
}