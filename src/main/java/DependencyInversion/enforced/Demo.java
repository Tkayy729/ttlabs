package DependencyInversion.enforced;

public class Demo {
    public static void main(String[] args) {
        PayPalPaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor("Emmanuel");
        Store store = new Store(payPalPaymentProcessor);
        store.purchaseBIke(5);
    }
}
