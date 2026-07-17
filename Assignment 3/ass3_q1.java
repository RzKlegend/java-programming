/*Develop a Calculator program using overloaded methods for addition of integers and
decimals. Use a static variable to count calculations */



import java.util.Scanner;

public class ass3_q1 {

    private static int calculationCount = 0;

    // Overloading method
    public static int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    public static double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    public static void incrementCount() {
        calculationCount++;
    }

    public static int getCalculationCount() {
        return calculationCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                if (firstNumber % 1 == 0 && secondNumber % 1 == 0) {
                    System.out.println("using integer addition method");
                    result = add((int) firstNumber, (int) secondNumber);
                } else {
                    System.out.println("using double addition method");
                    result = add(firstNumber, secondNumber);
                }
                break;

            case "-":
                incrementCount();
                result = firstNumber - secondNumber;
                break;

            case "*":
                incrementCount();
                result = firstNumber * secondNumber;
                break;

            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: division by zero");
                    scanner.close();
                    return;
                }
                incrementCount();
                result = firstNumber / secondNumber;
                break;

            default:
                System.out.println("Error: operator not supported");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        System.out.println("Total calculations performed: " + getCalculationCount());

        scanner.close();
    }
}
