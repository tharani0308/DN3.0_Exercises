public class FutureValueCalculator {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: when years are zero, future value is the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: future value for the current year + compounded value for the remaining years
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment amount
        double growthRate = 0.05;     // Growth rate (5%)
        int years = 10;               // Number of years

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }
}
