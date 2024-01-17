package chapter03_conditional_loop;

import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        scanner.close();

        double futureValue = calculateFutureValue(principal, annualInterestRate, compoundFrequency, years);

        System.out.printf("The future value of the investment is: %.2f%n", futureValue);
    }

    private static double calculateFutureValue(double principal, double annualInterestRate, int compoundFrequency, int years) {
        double ratePerPeriod = annualInterestRate / compoundFrequency;
        int totalCompounds = compoundFrequency * years;
        return principal * Math.pow(1 + ratePerPeriod, totalCompounds);
    }
}

