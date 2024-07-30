package adapter;

import gateway.GatewayAGateway;

public class GatewayAAdapter implements PaymentProcessor {
    private GatewayAGateway gatewayAGateway;

    public GatewayAAdapter() {
        this.gatewayAGateway = new GatewayAGateway();
    }

    @Override
    public void processPayment(double amount) {
        gatewayAGateway.process(amount);
    }
}
