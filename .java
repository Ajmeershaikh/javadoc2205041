/**
 * A class that contains a method to calculate simple interest.
 */
public class InterestCalculator {

    /**
     * Calculates the simple interest earned or paid on a principal amount over a specified time period.
     *
     * @param principle The principal amount (initial investment or loan amount).
     * @param rate      The annual interest rate (in percentage).
     * @param time      The time period in years over which the interest is calculated.
     * @return The calculated simple interest earned or paid.
     */
    public double calculateInterest(double principle, double rate, int time) {
        return principle * rate * time / 100;
    }

    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculator();

        // Example usage
        double principle = 1000; // Principle amount
        double rate = 5; // Annual interest rate (5%)
        int time = 2; // Time period in years

        // Calculate simple interest
        double interest = calculator.calculateInterest(principle, rate, time);

        // Output the result
        System.out.println("Simple Interest: $" + interest);
    }
}
