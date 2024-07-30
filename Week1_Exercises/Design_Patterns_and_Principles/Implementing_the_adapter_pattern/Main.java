public class Main {
    public static void main(String[] args) {
        PaymentProcessor gatewayA = new PaymentGatewayAAdapter(new PaymentGatewayA());
        PaymentProcessor gatewayB = new PaymentGatewayBAdapter(new PaymentGatewayB());

        // Process payments using different gateways through the adapters
        gatewayA.processPayment(100.0);
        gatewayB.processPayment(200.0);
    }
}
