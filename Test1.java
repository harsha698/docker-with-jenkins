import java.util.Scanner;

class Test1 {
    public static void main (String args []) {
        int num1  = 40;
        int num2 = 20;
        int sum, diff, product, quotient, remainder;
        System.out.println("Enter num 1 ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        System.out.println("Enter num 2 ");
        num2 = input.nextInt();
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;
        remainder = num1 % num2;
        System.out.println("Sum of 2 nums is: " +sum);
        System.out.println("Difference of 2 nums is: " +diff);
        System.out.println("Product of 2 nums is: " +product);
        System.out.println("Quotient of 2 nums is: " +quotient);
        System.out.println("Remainder of 2 nums is: " +remainder);

    }
}