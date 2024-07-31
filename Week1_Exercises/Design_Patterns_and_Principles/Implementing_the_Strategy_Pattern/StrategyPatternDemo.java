public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(500);

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(300);
    }
}
