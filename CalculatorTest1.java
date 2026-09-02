class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}


public class CalculatorTest1 {

    public static void main(String[] args) {

        System.out.println("Manual testing done by vasuki");

        Calculator c = new Calculator();

        // =========================
        // ADDITION TEST CASES
        // =========================

        double expected1 = 8;
        double result1 = c.add(5, 3);

        if (expected1 == result1)
            System.out.println("Addition Test Case 1 is PASSED");
        else
            System.out.println("Addition Test Case 1 is FAILED");


        double expected2 = -8;
        double result2 = c.add(-5, -3);

        if (expected2 == result2)
            System.out.println("Addition Test Case 2 is PASSED");
        else
            System.out.println("Addition Test Case 2 is FAILED");


        double expected3 = 5;
        double result3 = c.add(0, 5);

        if (expected3 == result3)
            System.out.println("Addition Test Case 3 is PASSED");
        else
            System.out.println("Addition Test Case 3 is FAILED");


        // =========================
        // SUBTRACTION TEST CASES
        // =========================

        double expected4 = 5;
        double result4 = c.subtract(8, 3);

        if (expected4 == result4)
            System.out.println("Subtraction Test Case 1 is PASSED");
        else
            System.out.println("Subtraction Test Case 1 is FAILED");


        double expected5 = -2;
        double result5 = c.subtract(-5, -3);

        if (expected5 == result5)
            System.out.println("Subtraction Test Case 2 is PASSED");
        else
            System.out.println("Subtraction Test Case 2 is FAILED");


        double expected6 = 5;
        double result6 = c.subtract(5, 0);

        if (expected6 == result6)
            System.out.println("Subtraction Test Case 3 is PASSED");
        else
            System.out.println("Subtraction Test Case 3 is FAILED");


        // =========================
        // MULTIPLICATION TEST CASES
        // =========================

        double expected7 = 15;
        double result7 = c.multiply(5, 3);

        if (expected7 == result7)
            System.out.println("Multiplication Test Case 1 is PASSED");
        else
            System.out.println("Multiplication Test Case 1 is FAILED");


        double expected8 = -15;
        double result8 = c.multiply(-5, 3);

        if (expected8 == result8)
            System.out.println("Multiplication Test Case 2 is PASSED");
        else
            System.out.println("Multiplication Test Case 2 is FAILED");


        double expected9 = 0;
        double result9 = c.multiply(0, 10);

        if (expected9 == result9)
            System.out.println("Multiplication Test Case 3 is PASSED");
        else
            System.out.println("Multiplication Test Case 3 is FAILED");


        // =========================
        // DIVISION TEST CASES
        // =========================

        double expected10 = 5;
        double result10 = c.divide(10, 2);

        if (expected10 == result10)
            System.out.println("Division Test Case 1 is PASSED");
        else
            System.out.println("Division Test Case 1 is FAILED");


        double expected11 = 5;
        double result11 = c.divide(20, 4);

        if (expected11 == result11)
            System.out.println("Division Test Case 2 is PASSED");
        else
            System.out.println("Division Test Case 2 is FAILED");


        double expected12 = -5;
        double result12 = c.divide(-10, 2);

        if (expected12 == result12)
            System.out.println("Division Test Case 3 is PASSED");
        else
            System.out.println("Division Test Case 3 is FAILED");
    }
}