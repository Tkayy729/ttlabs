package DependencyInversion.violate;

public class Store {
    private final Stripe stripe;

    public Store(String user) {
        this.stripe = new Stripe(user);
    }

    public void purchaseBIke(int quantity){
        this.stripe.makePayment(20* quantity * 100);
    }

    public void purchaseHelmet(int quantity){
        this.stripe.makePayment(15* quantity * 100);
    }
}
