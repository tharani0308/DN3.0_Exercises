public class FutureValueCalculator {

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double initialValue, double growthRate, int years) {
        double futureValue = initialValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment amount
        double growthRate = 0.05;     // Growth rate (5%)
        int years = 10;               // Number of years

        double futureValue = calculateFutureValueIterative(initialValue, growthRate, years);
        System.out.println("Future Value (Iterative): " + futureValue);
    }
}
