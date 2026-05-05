import java.util.Scanner;

class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public double calculateSimpleInterest(double principalAmount, double rateOfInterest, double timePeriod) {
        double simpleInterest = (principalAmount * rateOfInterest * timePeriod) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Inputs
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();

        // Object creation
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // Method call
        double interest = calculator.calculateSimpleInterest(principal, rate, time);

        // Output
        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate " + rate +
                " and Time " + time);
    }
}