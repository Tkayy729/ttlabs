package DependencyInversion.enforced;

public class Store {
    private final PayPalPaymentProcessor payPalPaymentProcessor;

    public Store(PayPalPaymentProcessor payPaymentProcessor) {
        this.payPalPaymentProcessor = payPaymentProcessor;
    }

    public void purchaseBIke(int quantity){
        this.payPalPaymentProcessor.pay(20 * quantity);
    }

    public void purchaseHelmet(int quantity){
        this.payPalPaymentProcessor.pay(15* quantity);
    }
}
