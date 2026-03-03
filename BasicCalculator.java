import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Addition = " + (num1 + num2)+" ,"+"Subtraction = " + (num1 - num2)+","+"Multiplication = " + (num1 * num2)+","+"Division = " + (num1 / num2));
    }

}
