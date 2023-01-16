package DependencyInversion.enforced;

public class PayPalPaymentProcessor {
    private final PayPal payPal;
    public PayPalPaymentProcessor(String user) {
        this.payPal = new PayPal(user);
    }

    public void pay(int amount){
        this.payPal.makePayment(amount);
    }
}
