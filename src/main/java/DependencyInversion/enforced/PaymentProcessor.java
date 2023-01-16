package DependencyInversion.enforced;

public class PaymentProcessor {
    private final String user;

    public PaymentProcessor(String user) {
        this.user = user;
    }

    public void pay(int amount) {
        System.out.println( user + " made payment of $"+amount );
    }
}
