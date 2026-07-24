/* Q.2)Develop an Employee Payroll System that accepts employee IDs, basic salary, and
bonus amounts from the user. Convert the entered values into wrapper objects and perform
validation operations to ensure valid salary values before calculating the net salary. */


import java.util.Scanner;
//Employee payroll system
public class ass4_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("EMPLOYEE PAYROLL SYSTEM");

        System.out.println("Enter employee id:");
        String str1 = sc.nextLine();
        System.out.println("Enter basic salary:");
        String str2 = sc.nextLine();
        System.out.println("Enter the bonus amount from the user");
        String str3 = sc.nextLine();

        //string to wrapper object
        Integer num1 = Integer.valueOf(str1);
        Double num2 = Double.valueOf(str2);
        Double num3 = Double.valueOf(str3);

        if (num1 <= 0) {
                System.out.println("\n[Error]: Employee ID must be a positive integer.");
                sc.close();
            
                return;
            }

            if (num2 <= 0) {
                System.out.println("\n[Error]: Basic salary must be greater than zero.");
                sc.close();
                return;
            }

            if (num3 < 0) {
                System.out.println("\n[Error]: Bonus amount cannot be negative.");
                sc.close();
                return;
            }
        
        //wrapper  object to promitive
        int a = num1;
        double b = num2;
        double c = num3;

        double netSum = num2 + num3;

        System.out.println("PAYROLL SLIP");
        System.out.println("Employee ID: " + a);
        System.out.println("Basic Salary: " + b);
        System.out.println("Bonus: " + c);
        System.out.println("Net Salary: " + netSum); 

        sc.close();
    }
}
