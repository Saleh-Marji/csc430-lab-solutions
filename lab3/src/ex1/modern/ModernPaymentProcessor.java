package ex1.modern;

import ex1.adapter.PaymentAdapter;

public class ModernPaymentProcessor {

    private final PaymentAdapter adapter = new PaymentAdapter();

    public void processPayment() {
        adapter.processPayment();
    }
}
