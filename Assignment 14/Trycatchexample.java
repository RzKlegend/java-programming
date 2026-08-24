

public class Trycatchexample {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 0;


        try {
            int result = num1 /num2;
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("error: cannot divide by zero!");
            System.err.println("exception message:- "+ e.getMessage());
        }

        System.err.println("program continues after exception handling");
    }
}
