package ex1.adapter;

import ex1.modern.ModernPaymentProcessor;

public class PaymentAdapter {

    private final ModernPaymentProcessor modernPaymentProcessor = new ModernPaymentProcessor();

    public void processPayment() {
        modernPaymentProcessor.processPayment();
    }
}
