package DependencyInversion.enforced;

public class Stripe {
    private final String user;

    public Stripe(String user) {
        this.user = user;
    }

    public void makePayment(int amountInCents){
        System.out.println( user + " made payment of $"+amountInCents/100 );
    }
}


