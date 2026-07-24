/*Create a program to convert student marks from String format to Integer and calculate
total marks.  */

import java.util.Scanner;

public class ass4_q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student marks for subject 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter student marks for subject 2:");
        String str2 = sc.nextLine();
        System.out.println("Enter student marks for subject 3:");
        String str3 = sc.nextLine();

        //string to wrapper object
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);
        Integer num3 = Integer.valueOf(str3);

        //wrapper object to primitive(unboxing)
        int a  = num1;
        int b = num2;
        int c = num3;

        int sum = a+b+c;
        System.out.println("The total marks of the student are:" + sum);
        sc.close();
        
    }
}
