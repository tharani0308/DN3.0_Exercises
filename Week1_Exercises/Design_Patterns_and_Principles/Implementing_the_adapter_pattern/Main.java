import adapter.PaymentProcessor;
import adapter.PayPalAdapter;
import adapter.StripeAdapter;
import adapter.GatewayAAdapter;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor payPal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();
        PaymentProcessor gatewayA = new GatewayAAdapter();

        payPal.processPayment(100.0);
        stripe.processPayment(200.0);
        gatewayA.processPayment(300.0);
    }
}
