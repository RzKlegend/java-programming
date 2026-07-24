import java.util.Scanner;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        String str1 = sc.nextLine();
        
        System.out.println("enter second number");
        String str2 = sc.nextLine();

        //string to wrapper object 
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        //wrapper object to primitive(unboxing)
        int a = num1;
        int b = num2;

        int sum = a+b;
        System.out.println("the sum of the 2 integers:" + sum);

        //primitive to wrapper (autoboxing)
        int x = 100;
        Integer wrapperX = x;

        System.out.println("\n Primitive to Wrapper");
        System.out.println("Primitive Value:" + x);
        System.out.println("Wrapper Object:" + wrapperX);

        //wrapper to primitive (unboxing)
        Integer wrapperY = Integer.valueOf(250);
        int y = wrapperY;

        System.out.println("wrapper to primitive");
        System.out.println("Wrapper object:" + wrapperY);
        sc.close();
    }
}