package DependencyInversion.enforced;

public class PayPal {
     String user;
    public PayPal(String user) {
        this.user = user;
    }

    public void makePayment(int amount){
        System.out.println( this.user + " made payment of $"+amount);
    }
}
